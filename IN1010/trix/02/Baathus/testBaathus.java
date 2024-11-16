class testBaathus {
    public static void main(String[] args) {
        Baat baat1 = new Baat("Toyota");
        Baat baat2 = new Baat("Misubishi");
        Baat baat3 = new Baat("Fergesun");
        Baat baat4 = new Baat("Boatz");
        Baat[] baatListe = {baat1, baat2, baat3, baat4};
        
        Baathus baathus = new Baathus(3);

        for (Baat baat : baatListe) {
            baathus.settInn(baat);
        }
    }
}
