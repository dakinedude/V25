import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;

class Garderobe {
    HashMap<String, Kategori> kategorier;
    ArrayList<Antrekk> antrekk;

    public Garderobe() {
        kategorier = new HashMap<String, Kategori>();
        antrekk = new ArrayList<Antrekk>();
    }

    public void nyttPlagg(String k, ArrayList<String> f) {
        Kategori tmp = new Kategori(k);
        tmp.nyttPlagg(f);
        kategorier.put(k, tmp);
    }

    public ArrayList<Antrekk> finnAntrekkTilAnledning(String anl) {
        ArrayList<Antrekk> ret = new ArrayList<>();
        for (Antrekk a : antrekk) {
            if (a.passerTil(anl)) {
                ret.add(a);
            }
        }
        return ret;
    }

    public Antrekk velgForsteAntrekk(String anl, String f) {
        for (Antrekk a : antrekk) {
            if (a.passerTil(anl) && a.harFarge(f)) {
                return a;
            }
        }
        return null;
    }

    public ArrayList<Plagg> finnPlaggTilAntrekk(ArrayList<String> k, String f) {
        ArrayList<Plagg> ret = new ArrayList<>();
        for (String navn : k) {
            Kategori tmp = kategorier.get(navn);
            if (tmp == null) {
                return null;
            }

            ArrayList<Plagg> tmp2 = tmp.finnPlaggMedFarge(f);
            if (tmp2.size() == 0) {
                return null;
            }

            Random rand = new Random();

            ret.add(rand.nextInt(tmp2.size()));
        }
        return ret;
    }

    public boolean lagNyttAntrekk(ArrayList<String> k, String f, String anl) {
        ArrayList<Plagg> pl = new Arraylist<>();
        for (String navn : k) {
            Kategori tmp = kategorier.get(navn);
            if (tmp == null) {
                return false;
            }

            ArrayList<Plagg> tmp2 = tmp.finnPlaggMedFarge(f);
            if (tmp2.size() == 0) {
                return false;
            }

            Random rand = new Random();
            ret.pl(rand.nextInt(tmp2.size()));
        }
        antrekk.add(new Antrekk(anl ,pl));
        return true;
    }
}
