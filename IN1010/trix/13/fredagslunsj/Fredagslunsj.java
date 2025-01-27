import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.CountDownLatch;

class Fredagslunsj {
    public static void main(String[] args) throws Exception {
        int elever = 435;
        CountDownLatch l = new CountDownLatch(elever);
        Monitor m = new Monitor();
        for (int i = 0; i < elever; i++) {
            Elev e = new Elev(m, l);
            Thread t = new Thread(e);
            t.start();
        }
        l.await();
        m.vinner();
    }
}

class Elev implements Runnable {
    private Monitor m;
    private CountDownLatch l;
    private boolean s;

    public Elev(Monitor m, CountDownLatch l) {
        this.m = m;
        this.l = l;
    }

    @Override
    public void run() {
        Random r = new Random();
        s = r.nextBoolean();
        m.stem(s);
        l.countDown();
    }
}

class Monitor {
    private AtomicInteger p = new AtomicInteger(0);
    private AtomicInteger g = new AtomicInteger(0);

    public void stem(boolean b) {
        if (b == true) {
            p.incrementAndGet();
        } else {
            g.incrementAndGet();
        }
    }

    public void vinner() {
        if (p.get() > g.get()) {
            System.out.println("Pannekaker vant med " + p.get() + " stemmer " + g.get());
        } else {
            System.out.println("Groet vant med " + g.get() + " stemmer " + p.get());
        }
    }
}
