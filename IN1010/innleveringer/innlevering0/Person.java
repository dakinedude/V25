class Person {
    Bil3 bil;

    public Person(Bil3 bil) {
        this.bil = bil;
    }

    public void skrivUt() {
        System.out.println(String.format("Jeg er en person. Bilen min har bilnr: %s", this.bil.hentNummer()));
    }
}
