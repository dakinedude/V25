class Ansatt extends Person {

    private int loenn;

    public Ansatt(String navn, int alder, int loenn) {
        super(navn, alder);
        this.loenn = loenn;
    }

    @Override
    public String hentInfo() {
        return String.format("Ansatt");
    }

    public int hentLoenn() {
        return this.loenn;
    }
          
}
