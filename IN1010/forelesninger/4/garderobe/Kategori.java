import java.util.Random;
import java.util.ArrayList;

class Kategori {
    String kategoriNavn;
    ArrayList<Plagg> plagg;

    public Kategori(String k) {
        kategoriNavn = k;
        plagg = new ArrayList<Plagg>();
    }

    public void nyttPlagg(ArrayList<String> farger) {
        plagg.add(new Plagg(farger));
    }

    public ArrayList<Plagg> finnPlaggMedFarge(String f) {
        ArrayList<Plagg> ret = new ArrayList<>();
        for (Plagg p : plagg) {
            if (p.harFarge(f)) {
                ret.add(p);
            }
        }
    }

    public Plagg trekkTilfeldigPlagg() {
        Random rand = new Random();
        return plagg.get(rand.nextInt(plagg.size()));
    }
}
