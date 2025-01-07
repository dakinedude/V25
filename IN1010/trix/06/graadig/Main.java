class Main {
    public static void main(String[] args) {
        Beholder<Katt> b = new Beholder<>();
        Katt k1 = new Katt("Felix", 12);
        Katt k2 = new Katt("Felix", 13);

        System.out.println(b.settInn(k1));
        System.out.println(b.settInn(k2));
    }
}
