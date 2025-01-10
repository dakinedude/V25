class Firek extends AbonnementDecorator {
    public Firek(Abonnement a) {
        super(a);
    }

    @Override
    public double hentPris() {
        return super.hentPris() + 50;
    }

    @Override
    public String hentInfo() {
        return super.hentInfo() + " + 4K-kvalitet";
    }
}
