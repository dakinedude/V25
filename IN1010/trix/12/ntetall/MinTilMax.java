class MinTilMax implements Runnable {
    private int min;
    private int max;
    private int n;
    private Monitor m;

    public MinTilMax(int min, int max, int n, Monitor m) {
        this.min = min;
        this.max = max;
        this.n = n;
        this.m = m;
    }

    @Override
    public void run() {
        while (min <= max) {
            if (min % n == 0) {
                m.metode(min);
                // System.out.println("MinTilMax: " + min);
            }
            min++;
        }
    }
}
