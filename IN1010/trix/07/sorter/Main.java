class Main {
    public static void main(String[] args) {
        SortertArrayList<Katt> s = new SortertArrayList<Katt>();
        Katt k1 = new Katt("Felix", 12);
        Katt k2 = new Katt("Kaka", 1);
        Katt k3 = new Katt("Kokok", 11);
        Katt k4 = new Katt("Momo", 10);

        s.SettInn(k1);
        s.SettInn(k2);
        s.SettInn(k3);
        s.SettInn(k4);

        for (int i = 0; i < 4; i++) {
            System.out.println(s.Hent(i));
        }
    }
}
