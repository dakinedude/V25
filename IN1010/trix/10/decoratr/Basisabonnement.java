class Basisabonnement implements Abonnement {
    @Override
    public double hentPris() {
        return 100; // det koster 100 pr. maaned
    }

    public String hentInfo() {
        return "Basispakke";
    }
}
