import java.util.concurrent.locks.*;

class Monitor {
    private int forrige = -1;
    private Lock las = new ReentrantLock();

    public void metode(int n) {
        las.lock();
        while (n > forrige) {
            System.out.println(n);
            forrige = n;
        }
        las.unlock();
    }
}
