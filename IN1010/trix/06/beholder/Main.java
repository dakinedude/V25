class Main {
    public static void main(String[] args) {
        Kvadrat k = new Kvadrat();
        Sirkel s = new Sirkel();
        Beholder<Sirkel> b = new Beholder<Sirkel>();

        b.settInn(s);
        b.settInn(k);
    }
}
