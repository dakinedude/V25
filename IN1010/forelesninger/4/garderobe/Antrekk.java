import java.util.ArrayList;

class Antrekk {
    ArrayList<String> anledninger;
    ArrayList<Plagg> plagg;

    public Antrekk(String a, ArrayList<Plagg> p) {
        anledninger = new ArrayList<String>();
        anledninger.add(a);
        plagg = p;
        for (Plagg p : plag) {
            plagg.oppdaterAntAntrekk;
        }
    }

    public ArrayList<Plagg> hentPlaggene() {
        return plagg;
    }

    public void leggTilAnledning(String a) {
        anledninger.add(a);
    }

    public boolean passerTil(String a) {
        return anledninger.contains(a);
    }

    public boolean harFarge(String f) {
        for (Plagg p : plagg) {
            if (p.harFarge(f)) {
                return true;
            }
        }
        return false;
    }
}
