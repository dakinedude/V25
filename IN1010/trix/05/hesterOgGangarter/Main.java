class Main {
    public static void main(String[] args) {
        engelskFullblodshest e = new engelskFullblodshest("Java", 5);
        islandsHest i = new islandsHest("Python", 3);
        pasoFino p = new pasoFino("Haskell", 7);
        
        e.skritt();
        e.trav();
        e.galopp();

        i.toelt();
        i.pass();
        i.trav();
        i.galopp();

        p.pass();
        p.trav();
        p.galopp();
    }
}
