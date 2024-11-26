import java.util.ArrayList;

class Professor extends Forsker {
    ArrayList<String> kurs = new ArrayList<>();

    public Professor(String navn, int alder, int loenn, String fagomraade) {
        super(navn, alder, loenn, fagomraade);
    }

    public void leggTilKurs(String ny) {
        this.kurs.add(ny);
    }

    @Override
    public String hentInfo() {
        return String.format("Professor i %s", this.fagomraade);
    }

    public ArrayList<String> hentKurs() {
        return this.kurs;
    }
}
