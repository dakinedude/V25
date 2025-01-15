class Main {
    public static void main(String[] args) {
        Monitor m = new Monitor();
        Nedover n = new Nedover(m);
        Oppover o = new Oppover(m);

        Thread nt = new Thread(n);
        nt.start();
        Thread ot = new Thread(o);
        ot.start();
    }
}
