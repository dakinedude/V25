class Main {
    public static void main(String[] args) {
        Bachelorstudent bs = new Bachelorstudent("Mats", 24, "IFI");
        Masterstudent ms = new Masterstudent("Ola", 23, "MF");
        Ansatt a = new Ansatt("John", 30, 220);
        Forsker f = new Forsker("Mark", 40, 235, "Informatikk");
        Professor p = new Professor("Knut", 50, 240, "Medisin");

        bs.leggTilKurs("IN1010");
        ms.leggTilKurs("MF4430");
        p.leggTilKurs("MF4430");

        Person[] personer = {bs, ms, a, f, p};

        for (Person person : personer) {
            System.out.print(String.format("%s er %d aar gammel og er %s%n",person.hentNavn(), person.hentAlder(), person.hentInfo()));
        }
      
    }
}
