import java.util.ArrayList;

class Student {
    private String navn;
    private ArrayList<Emne> emner = new ArrayList<Emne>();

    public Student(String navn) {
        this.navn = navn;
    }

    public String hentNavn() {
        return this.navn;
    }

    public void leggTilEmne(Emne emne) {
        emner.add(emne);
    }
        
    public void hentEmner() {
        for (Emne emne : this.emner) {
            System.out.println(emne.hentKode());
        }
    }

    public int hentAntEmner() {
        return this.emner.size();
    }

}
