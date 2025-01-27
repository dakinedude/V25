import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Postkontor postkontor = new Postkontor();

        Post[] pakker = {
            new Post("Alice", "A letter from Bob"),
            new Post("Bob", "A package from Alice"),
            new Post("Charlie", "A postcard from Dave"),
            new Post("Alice", "A parcel from Eve"),
            new Post("Dave", "A letter from Charlie"),
            new Post("Eve", "A package from Alice"),
            new Post("Bob", "A postcard from Eve"),
            new Post("Charlie", "A letter from Alice"),
            new Post("Dave", "A package from Bob"),
            new Post("Eve", "A postcard from Charlie")
        };

        CountDownLatch latch = new CountDownLatch(10);

        Postmann postmann = new Postmann(latch, pakker, postkontor);
        Thread postmannThread = new Thread(postmann);
        postmannThread.start();

        Thread aliceThread = new Thread(new Kunde("Alice", postkontor, latch));
        Thread bobThread = new Thread(new Kunde("Bob", postkontor, latch));
        Thread charlieThread = new Thread(new Kunde("Charlie", postkontor, latch));
        Thread daveThread = new Thread(new Kunde("Dave", postkontor, latch));
        Thread eveThread = new Thread(new Kunde("Eve", postkontor, latch));

        aliceThread.start();
        bobThread.start();
        charlieThread.start();
        daveThread.start();
        eveThread.start();

        latch.await();
        System.out.println("All post has been collected.");
    }
}

class Post {
    String mottaker;
    String beskrivelse;

    public Post(String m, String b) {
        this.mottaker = m;
        this.beskrivelse = b;
    }

    public String hentMottaker() {
        return this.mottaker;
    }
}

class Postmann implements Runnable {
    private CountDownLatch latch;
    private Post[] pakker;
    private Postkontor pk;

    public Postmann(CountDownLatch l, Post[] p, Postkontor pk) {
        this.latch = l;
        this.pakker = p;
        this.pk = pk;
    }

    @Override
    public void run() {
        for (Post p : pakker) {
            try {
                pk.leverPost(p);
            } catch (InterruptedException e) {
                System.out.println("Postmann was interrupted. Stopping delivery.");
                Thread.currentThread().interrupt();
                break;
            }
        }
        pk.setAllDelivered();
    }
}

class Kunde implements Runnable {
    String n;
    Postkontor pk;
    CountDownLatch latch;

    public Kunde(String n, Postkontor pk, CountDownLatch latch) {
        this.n = n;
        this.pk = pk;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Post p = pk.hentPost(n);
                if (p == null) {
                    break;
                }
                System.out.println(n + " collected: " + p.beskrivelse);
                latch.countDown();
            }
        } catch (InterruptedException e) {
            System.out.println("Kunde " + n + " was interrupted while waiting for post.");
            Thread.currentThread().interrupt();
        }
    }
}

class Postkontor {
    private Post[] post = new Post[10];
    private Lock las = new ReentrantLock();
    private Condition ikkeFullt = las.newCondition();
    private Condition ikkeTomt = las.newCondition();
    private Condition nyPost = las.newCondition();
    private final int TOT = 10;
    private int ant = 0;
    private boolean allDelivered = false;

    public void leverPost(Post p) throws InterruptedException {
        las.lock();
        try {
            while (ant >= TOT) {
                ikkeFullt.await();
            }
            for (int i = 0; i < TOT; i++) {
                if (post[i] == null) {
                    post[i] = p;
                    break;
                }
            }
            ant++;
            System.out.println("leverer post, ant: " + ant);
            nyPost.signal();
            ikkeTomt.signal();
        } finally {
            las.unlock();
        }
    }

    public Post hentPost(String navn) throws InterruptedException {
        las.lock();
        try {
            while (ant <= 0 && !allDelivered) {
                ikkeTomt.await();
            }
            for (int i = 0; i < TOT; i++) {
                if (post[i] != null && post[i].hentMottaker().equals(navn)) {
                    Post tmp = post[i];
                    ant--;
                    post[i] = null;
                    ikkeFullt.signal();
                    return tmp;
                }
            }
            if (allDelivered) {
                return null;
            }
            nyPost.await();
            return this.hentPost(navn);
        } finally {
            las.unlock();
        }
    }

    public void setAllDelivered() {
        las.lock();
        try {
            allDelivered = true;
        } finally {
            las.unlock();
        }
    }
}
