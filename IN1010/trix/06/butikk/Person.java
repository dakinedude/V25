class Person {
    String navn;
    String gjenstand;
    Person neste;

    public Person(String navn, String gjenstand, Person neste) {
        this.navn = navn;
        this.gjenstand = gjenstand;
        this.neste = neste;
    }

    public void SettNeste(Person neste) {
        this.neste = neste;
    }

    public String HentNavn() {
        return this.navn;
    }

    public String HentGjenstand() {
        return this.gjenstand;
    }

    public Person HentNeste() {
        return this.neste;
    }
}
