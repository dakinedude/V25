import java.util.concurrent.atomic.AtomicInteger;

class Monitor {
    private AtomicInteger tilfeller = new AtomicInteger(0);
        
    public void nyttTilfelle() {
        tilfeller.incrementAndGet();
    }

    public int hentTilfeller() {
        return tilfeller.get();
    }
}
