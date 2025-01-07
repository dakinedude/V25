class Main {
    public static void main(String[] args) {
        EnkelArrayListe e = new EnkelArrayListe(5);
        e.LeggInn("Hei");
        e.LeggInn("paa");
        e.LeggInn("deg");
        e.LeggInn("din");
        e.LeggInn("fisk");

        while (e.hasNext()) {
            System.out.println(e.next());
        }
    }
}
