import java.util.concurrent.locks.*;

class Bank {
    private Lock banklas = new ReentrantLock();
    private Condition ikkeTom = banklas.newCondition();
    private int saldo = 100;

    void ta(int belop) throws InterruptedException {
        banklas.lock();
        try {
            while (belop > this.saldo) {
                ikkeTom.await();
            }
            this.saldo -= belop;
        } finally {
            banklas.unlock();
        }
    }

    void gi(int belop) throws InterruptedException {
        banklas.lock();
        try {
            this.saldo += belop;
            ikkeTom.signalAll();
        } finally {
            banklas.unlock();
        }
    }

    void saldo() {
        banklas.lock(); {
            try {
                System.out.println("Saldo: " + this.saldo);
            } finally {
                banklas.unlock();
            }
        }
    }
}
