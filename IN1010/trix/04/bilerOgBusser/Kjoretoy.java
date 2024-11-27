import java.util.ArrayList;

abstract class Kjoretoy implements Skatt{

    protected String regnr;
    protected String merke;
    protected String eier;
    static protected ArrayList<Kjoretoy> alle = new ArrayList<>();

    public Kjoretoy(String regnr, String merke, String eier) {
        this.regnr = regnr;
        this.merke = merke;
        this.eier = eier;
    }

    public String hentRegnr() {
        return this.regnr;
    }

    public String hentEier() {
        return this.eier;
    }

    abstract public String hentInfo();

    static public ArrayList<Kjoretoy> alleKjoretoy() {
        return alle;
    }
}
