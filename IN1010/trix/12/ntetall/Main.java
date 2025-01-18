class Main {
    public static void main(String[] args) {
        Monitor m = new Monitor();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new MinTilMax(i, 10000, 1, m));
            t.start();
        }
    }
}
