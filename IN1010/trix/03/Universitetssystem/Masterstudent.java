class Masterstudent extends Student {
    private boolean tilgang = false;

    public Masterstudent(String navn, int alder, String sted) {
        super(navn, alder, sted);
    }

    @Override
    public String hentInfo() {
        return String.format("Masterstudent ved %s", this.sted);
    }

    public boolean hentTilgang() {
        return this.tilgang;
    }
}
