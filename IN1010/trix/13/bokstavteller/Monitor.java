import java.util.concurrent.locks.*;
import java.util.ArrayList;

class Monitor {
    private ArrayList<String> liste;
    private char bokstav;
    private Lock las;
    private int cnt;
    
    public Monitor(ArrayList<String> liste, char bokstav) {
        this.liste = liste;
        this.bokstav = bokstav;
        this.las = new ReentrantLock();
        this.cnt = 0;
    }

    public boolean more() { // for debugging?
        las.lock();
        try {
            if (cnt > liste.size() - 1) {
                return false;
            }
            return true;
        } finally {
            las.unlock();
        }
    }

    public String hentOrd() {
        las.lock();
        try {
            if (cnt >= liste.size()) {
                return null;
            }
            String tmp = liste.get(cnt);
            cnt++;
            return tmp;
        } finally {
            las.unlock();
        }
    }

    public char hentBokstav() {
        return this.bokstav;
    }
}
