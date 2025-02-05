import java.util.ArrayList;

class Plagg {
    ArrayList<String> farger;
    int antAntrekk;

    public Plagg(ArrayList<String> f) {
        farger = f;
        antAntrekk = 0;
    }

    public boolean harFarge(String farge) {
        return farger.contains(farge);
    }

    public int hentAntAntrekk() {
        return antAntrekk;
    }

    public void oppdaterAntAntrekk() {
        antAntrekk++;
    }
}
