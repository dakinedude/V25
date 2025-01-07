class Main {
    public static void main(String[] args) {
        Dobbellenke<Integer> d = new Dobbellenke<>();
        d.SettInn(1);
        d.SettInn(2);
        d.SettInn(3);
        System.out.println("Lengde: " + d.Lengde());
        System.out.println(d.Fjern(1));
        System.out.println(d.Fjern(0));
        System.out.println(d.Fjern(0));
        System.out.println(d.Fjern(0));
        System.out.println("Lengde: " + d.Lengde());
    }
}
