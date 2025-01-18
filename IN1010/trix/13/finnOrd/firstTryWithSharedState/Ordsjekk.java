class Ordsjekk implements Runnable {
    Monitor monitor;
    String ord;

    public Ordsjekk(Monitor m, String o) {
        this.monitor = m;
        this.ord = o;
    }

    @Override
    public void run() {
        String sjekk;
        
        while (true) {
            sjekk = monitor.hentOrd();

            if (sjekk == null) {
                break;
            }

            if (this.ord.equals(sjekk)) {
                monitor.nyForekomst();
            }
        }
    }
}
