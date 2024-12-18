class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ole", "Ost", null);
        Person p2 = new Person("Dole", "Dadler", null);
        Person p3 = new Person("Arne", "Anis", null);
        Person p4 = new Person("Jens", "Jarlsberg", null);
        Person p5 = new Person("Askeladden", "Broed", null);
        Person p6 = new Person("Torgrim", "Triks", null);
        Person[] personer = {p1,p2,p3,p4,p5,p6};

        Butikk b = new Butikk(null);

        for (Person person : personer) {
            b.EntreButikk(person);
        }

        b.Kassa();
    }
}
