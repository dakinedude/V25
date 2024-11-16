import java.util.HashMap;
import java.util.ArrayList;

class Emne {
    static public ArrayList<Student> alleStudenter = new ArrayList<Student>();
    static public ArrayList<Emne> emner = new ArrayList<Emne>();
    static public HashMap<String, Student> alleStudenterNavn = new HashMap<String, Student>(); 
    private ArrayList<Student> emneStudenter = new ArrayList<Student>();
    String emneKode;

    static void fjernStudent(Student student) {
        alleStudenter.remove(student);
        alleStudenterNavn.remove(student.hentNavn());
        for (Emne emne : emner) {
            emne.fjernStudentFraEmne(student);
        }
        System.out.println(student.hentNavn() + " ble fjernet fra universitetet.");
    }
        
    public Emne(String emneKode) {
        this.emneKode = emneKode;
        emner.add(this);
    }

    public void leggTilStudent(Student student) {
        this.emneStudenter.add(student);
        alleStudenter.add(student);
        alleStudenterNavn.put(student.hentNavn(), student);
        System.out.println(student.hentNavn() + " ble lagt til i " + this.hentKode());
    }

    public static void leggTilStudentSystem(Student student) {
        alleStudenter.add(student);
        alleStudenterNavn.put(student.hentNavn(), student);
    }
    
    public void fjernStudentFraEmne(Student student) {
        this.emneStudenter.remove(student);
        System.out.println(student.hentNavn() + " ble fjernet fra " + this.hentKode());
    }

    public String hentKode() {
        return this.emneKode;
    }

    public int antStudenter() {
        return this.emneStudenter.size();
    }

    public Student[] hentEmneStudenter() {
        Student[] ret = new Student[emneStudenter.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = this.emneStudenter.get(i);
        }
        return ret;
    }

    public static boolean sjekkOmStudentFinnes(String navn) {
        return alleStudenterNavn.keySet().contains(navn);
    }

    public static Student finnStudent(String navn) {
        return alleStudenterNavn.get(navn);
    }

    public static void hentAlleStudenter() {
        for (Student student : alleStudenter) {
            System.out.println(student.hentNavn());
        }
    }

    public static Emne hentMestPop() {
        int max = 0;
        Emne ret = null; 
        for (Emne emne : emner) {
            if (emne.antStudenter() > max) {
                max = emne.antStudenter();
                ret = emne;
            }
        }
        return ret;
    }

    public static Student hentAktivStudent() {
        int max = 0;
        Student ret = null;
        for (Student student : alleStudenter) {
            if (student.hentAntEmner() > max) {
                max = student.hentAntEmner();
                ret = student;
            }
        }
        return ret;
    }

    public static Emne finnEmne(String kode) {
        for (Emne emne : emner) {
            if (kode.equals(emne.hentKode())) {
                return emne;
            }
        }
        return null;
    }
}
