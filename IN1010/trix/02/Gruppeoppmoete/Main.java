class Main {
    public static void main(String[] args) throws Exception {
        String filnavn = "gruppeliste.txt";
        Gruppeoppmoete gruppe1 = new Gruppeoppmoete(filnavn);
        gruppe1.registrerOppmoete("Ali");
        gruppe1.registrerOppmoete("Ola");
        gruppe1.registrerOppmoete("Petter");
        gruppe1.skrivUt();
    }
}
