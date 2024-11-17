class Person {
    private String navn;
    private String tlf;
    private String adr;

    public Person(String navn, String tlf, String adr) {
        this.navn = navn;
        this.tlf = tlf;
        this.adr = adr;
    }

    public void skrivInfo() {
        System.out.println(String.format("navn: %s", this.navn));
        System.out.println(String.format("Telefonnummer: %s", this.tlf));
        System.out.println(String.format("Adresse: %s%n", this.adr));
    }

    public String hentNavn() {
        return this.navn;
    }
}
        
                
