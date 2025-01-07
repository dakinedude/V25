class Main {
    public static void main(String[] args) {
        Lenkeliste<Integer> d = new Lenkeliste<>();
        d.SettInn(1);
        d.SettInn(2);
        d.SettInn(3);

        System.out.println(d.Lengde());
        System.out.println(d.Hent(0));
        System.out.println(d.Hent(1));
        System.out.println(d.Hent(2));
        System.out.println(d.Hent(3));

    }
}
