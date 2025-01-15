import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class FellesBord { // monitor
    private Lock bordlas;
    private Condition ikkeTomtBord;
    private Condition ikkeFulltBord;
    private int antallPaBordet = 0;
    private final int BORD_KAPASITET;

    public FellesBord(int ant) {
        BORD_KAPASITET = ant;
        bordlas = new ReentrantLock();
        ikkeTomtBord = bordlas.newCondition();
        ikkeFulltBord = bordlas.newCondition();
    }

    void settTallerken() throws InterruptedException {
        bordlas.lock();
        try {
            while (antallPaBordet >= BORD_KAPASITET) {
                ikkeFulltBord.await(); // vent paa ikkefult signal
            }
            antallPaBordet++;
            System.out.println("Setter tallerken. Ant: " + antallPaBordet);
            ikkeTomtBord.signal();
        } finally {
            bordlas.unlock();
        }
    }

    void hentTallerken() throws InterruptedException {
        bordlas.lock();
        try {
            while (antallPaBordet <= 0) {
                ikkeTomtBord.await();
            }
            antallPaBordet--;
            System.out.println("Henter tallerken. Ant: " + antallPaBordet);
            ikkeFulltBord.signal();
        } finally {
            bordlas.unlock();
        }
    }
}
