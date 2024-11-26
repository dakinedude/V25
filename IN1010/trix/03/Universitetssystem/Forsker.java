class Forsker extends Ansatt {
    String fagomraade;

    public Forsker(String navn, int alder, int loenn, String fagomraade) {
        super(navn, alder, loenn);
        this.fagomraade = fagomraade;
    }

    @Override
    public String hentInfo() {
        return String.format("Forsker i %s", this.fagomraade);
    }
}
