import java.util.concurrent.locks.*;
import java.io.File;

class Monitor {
    private String[] alleOrd;
    private Lock las;
    private Lock flas;
    private int index;
    private int forekomst;
    private Condition merIgjen;
    // int lengde;

    public Monitor(String[] alleOrd) {
        this.index = 0;
        this.alleOrd = alleOrd;
        this.las = new ReentrantLock();
        this.flas = new ReentrantLock();
        this.forekomst = 0;
    }

    public void nyForekomst() {
        flas.lock();
        try {
            System.out.println(index);
            this.forekomst++;
        } finally {
            flas.unlock();
        }
    }

    public int hentForekomst() {
        if (this.index >= this.alleOrd.length) {
            return this.forekomst;
        } else {
            return 0;
        }
    }

    public String hentOrd() {
        las.lock();
        try {
            if (this.index < this.alleOrd.length) {
                String tmp = alleOrd[index];
                index++;
                return tmp;
            } else {
                return null;
            }
        } finally {
            las.unlock();
        }
    }
}
