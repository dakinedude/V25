class Bil3 {
    private String bilnr;
    
    public Bil3(String bilnr) {
        this.bilnr = bilnr;
    }

    public void skrivUt() {
        System.out.println(String.format("Jeg er en bil med bilnr: %s", this.bilnr));
    }

    public String hentNummer() {
        return this.bilnr;
    }
}
