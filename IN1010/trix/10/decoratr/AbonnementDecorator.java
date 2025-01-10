abstract class AbonnementDecorator implements Abonnement {
    private final Abonnement decoratedAbonnement;

    public AbonnementDecorator(Abonnement a) {
        this.decoratedAbonnement = a;
    }

    @Override
    public double hentPris() {
        return this.decoratedAbonnement.hentPris();
    }

    @Override
    public String hentInfo() {
        return this.decoratedAbonnement.hentInfo();
    }
}
