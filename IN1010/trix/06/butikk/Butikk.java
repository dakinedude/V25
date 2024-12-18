class Butikk {
    Person start;

    public Butikk(Person start) {
        this.start = start;
    }

    public void EntreButikk(Person p) {
        if (this.start == null) {
            this.start = p;
            return;
        }

        Person tmp = this.start;
        while (tmp.HentNeste() != null) {
            tmp = tmp.HentNeste();
        }
        tmp.SettNeste(p);
    }

    public void Kassa() {
        Person tmp = this.start;
        while (tmp != null) {
            System.out.println(String.format("%s kjoeper %s", tmp.HentNavn(), tmp.HentGjenstand()));
            tmp = tmp.HentNeste();
            this.start = tmp;
        }
    }
}
