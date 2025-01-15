class Oppover implements Runnable {
    private int min;
    private Monitor m;

    public Oppover(Monitor m) {
        this.m = m;
        this.min = -1000000;
    }

    @Override
    public void run() {
        while (m.settMinste(min)) {
            min++;
        }
        System.out.println("Oppover stoppet: " + min);
    }
}
