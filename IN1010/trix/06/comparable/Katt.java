import java.util.*;

class Katt implements Comparable<Katt> {
    String navn;
    int alder;

    public Katt(String n, int a) {
        this.navn = n;
        this.alder = a;
    }

    public String toString() {
        return String.format("Navn: %s, alder: %d", this.navn, this.alder);
    }

    @Override
    public int compareTo(Katt other) {
        if (this.alder < other.alder) {
            return -1;
        } else {
            return 1;
        }
    }
}
