class Main {
    public static void main(String[] args) {
        Bank b = new Bank();
        Thread[] trader = new Thread[25];

        for (int i = 0; i < trader.length; i++) {
            trader[i] = new Thread(new GiOgTa(b, getRandom(1, 100)));
            trader[i].start();
        }

        b.saldo();

    }

    public static int getRandom(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
