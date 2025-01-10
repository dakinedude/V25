class Person implements Comparable<Person> {
    String navn;
    int aar;
    Person mor;
    Person far;

    public Person(int a, String n, Person m, Person f) {
        this.navn = n;
        this.aar = a;
        this.mor = m;
        this.far = f;
    }

    public Person finnEldsteKjenteForfader() {
        if (this.mor == null && this.far == null) {
            return this;
        }

        Person eldst = null;
        Person mor = null;
        Person far = null;
        
        if (this.mor != null) {
            mor = this.mor.finnEldsteKjenteForfader();
        }

        if (this.far != null) {
            far = this.far.finnEldsteKjenteForfader();
        }

        if (mor != null && far != null) {
            if (mor.compareTo(far) == -1) {
                eldst = mor;
            } else {
                eldst = far;
            }
        } else {
            if (mor == null) {
                eldst = far;
            } else {
                eldst = mor;
            }
        }

        return eldst;
    }

    @Override
    public String toString() {
        return String.format("navn: %s, aar: %d", this.navn, this.aar);
    }

    @Override
    public int compareTo(Person other) {
        if (this.aar < other.hentAar()) {
            return -1;
        } else if (this.aar > other.hentAar()) {
            return 1;
        } 
        return 0;
    }

    public String hentNavn() {
        return this.navn;
    }

    public int hentAar() {
        return this.aar;
    }

    public Person hentMor() {
        return this.mor;
    }

    public Person hentFar() {
        return this.far;
    }
}
