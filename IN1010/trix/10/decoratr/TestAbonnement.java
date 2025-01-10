class TestAbonnement {

    public static void printInfo(Abonnement a) {
        System.out.println("Pris: " + a.hentPris() + " , Info: " +  a.hentInfo());
    }
    public static void main(String[] args) {
        Abonnement a = new Basisabonnement();
        printInfo(a);
        a = new FamilieAbonnement(a);
        printInfo(a);
        a = new Firek(a);
        printInfo(a);
    }
}
