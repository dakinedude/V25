import java.util.Iterator;

class Butikk implements Iterable<Person> {
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

    public Iterator<Person> iterator() {
        return new PersonIterator();
    }

    class PersonIterator implements Iterator<Person> {
        private Person denne;

        public PersonIterator() {
            denne = start;
        }

        @Override
        public boolean hasNext() {
            return denne != null;
        }

        @Override
        public Person next() {
            Person temp = denne;
            denne = denne.HentNeste();
            return temp;
        }
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
