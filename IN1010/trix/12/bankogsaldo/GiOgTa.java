class GiOgTa implements Runnable {

    Bank bank;
    int belop;

    public GiOgTa(Bank b, int belop) {
        this.bank = b;
        this.belop = belop;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                bank.ta(belop);
                bank.gi(belop);
                bank.saldo();
            }
        } catch (InterruptedException e) {
            System.out.println("Uventet stopp: " + e);
        }
    }
}
