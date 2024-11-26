class Bachelorstudent extends Student {
    private boolean tilgang = false;

    public Bachelorstudent(String navn, int alder, String sted) {
        super(navn, alder, sted);
    }

    @Override
    public String hentInfo() {
        return String.format("Bachelorstudent ved %s", this.sted);
    }

    public boolean hentTilgang() {
        return this.tilgang;
    }
}
