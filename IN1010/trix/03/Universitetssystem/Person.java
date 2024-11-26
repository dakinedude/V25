abstract class Person {

    private String navn;
    private int alder;

    public Person(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }
    
    public String hentNavn() {
        return this.navn;
    }

    public int hentAlder() {
        return this.alder;
    }

    public abstract String hentInfo();
}
