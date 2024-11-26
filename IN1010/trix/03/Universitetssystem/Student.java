import java.util.ArrayList;

class Student extends Person {
    private ArrayList<String> kurs = new ArrayList<>();
    String sted;

    public Student(String navn, int alder, String sted) {
        super(navn, alder);
        this.sted = sted;
    }

    public void leggTilKurs(String ny) {
        this.kurs.add(ny);
    }

    public ArrayList<String> hentKurs() {
        return kurs;
    }

    @Override
    public String hentInfo() {
        return String.format("Student ved %s", sted);
    }
}
