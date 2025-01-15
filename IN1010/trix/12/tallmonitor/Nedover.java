class Nedover implements Runnable {
    private Monitor m;
    private int max;

    

    public Nedover(Monitor m) {
        this.m = m;
        this.max = 1000000;
    }

    @Override
    public void run() {
        while (m.settStoerste(max)) {
            max--;
        }
        System.out.println("Nedover stoppet: " + max);
    }
}
