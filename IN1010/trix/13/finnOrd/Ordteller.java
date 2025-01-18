import java.util.concurrent.CountDownLatch;

class Ordteller implements Runnable {
    private Monitor monitor;
    private CountDownLatch latch;
    private String ordet;
    private String[] array;
    
    public Ordteller(Monitor m, CountDownLatch l, String o, String[] a) {
        monitor = m;
        latch = l;
        ordet = o;
        array = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(ordet)) {
                monitor.nyttTilfelle();
            }
        }
        latch.countDown();
    }
}
