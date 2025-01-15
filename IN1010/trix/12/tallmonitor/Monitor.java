import java.util.concurrent.locks.*;

class Monitor {
    private int detMinste = Integer.MIN_VALUE;
    private int detStoerste = Integer.MAX_VALUE;
    private Lock las = new ReentrantLock();

    public boolean settMinste(int ny) {
        las.lock();
        try {
            if (ny < detStoerste) {
                detMinste = ny;
                return true;
            } else {
                return false;
            }
        } finally {
            las.unlock();
        }
    }

    public boolean settStoerste(int ny) {
        las.lock();
        try {
            if (detMinste < ny) {
                detStoerste = ny;
                return true;
            } else {
                return false;
            }
        } finally {
            las.unlock();
        }
    }
}
