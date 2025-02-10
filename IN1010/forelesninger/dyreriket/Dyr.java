import java.util.HashSet;

public abstract class Dyr {
    public final static String RIKE = "Animalia";
    protected HashSet<String> kjennetegn;

    public Dyr(HashSet<String> k) {
        kjennetegn = k;
    }

    public abstract void leggTilKjennetegn(String k);
}
