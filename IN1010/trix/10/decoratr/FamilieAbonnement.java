class FamilieAbonnement extends AbonnementDecorator {
    public FamilieAbonnement(Abonnement a) {
        super(a);
    }

    @Override
    public double hentPris() {
        return super.hentPris() + 100; //koster 100 ekstra pr mnd
    }

    @Override
    public String hentInfo() {
        return super.hentInfo() + " + familiepakke";
    }
}
