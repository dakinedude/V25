class Bokstavteller implements Runnable {
    private Monitor m;
    
    public Bokstavteller(Monitor m) {
        this.m = m;
    }

    @Override
    public void run() {
        while (true) {
            String ord = m.hentOrd();
            if (ord == null) {
                break;
            }
            char bokstav = m.hentBokstav();
            int cnt = 0;
            for (int i = 0; i < ord.length(); i++) {
                if (ord.charAt(i) == bokstav) {
                    cnt++;
                }
            }
            System.out.println(String.format("%c forekommer %d ganger i %s", bokstav, cnt, ord));
        }
    }
}
