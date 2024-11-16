import java.util.Scanner;
import java.io.File;

class Main {

    public static void hentInfo() {
        System.out.println("<q> for avslutt. Hva vil du gjoere?");
        System.out.println("<i> for info");
        System.out.println("1: Finn mest populaere fag");
        System.out.println("2: Finn mest aktive student");
        System.out.println("3: Skriv ut alle studenter som tar fag");
        System.out.println("4: Skriv ut alle fagene til student");
        System.out.println("5: Legg til student i fag");
        System.out.println("6: Legg til fag hos student");
        System.out.println("7: Legg til ny student");
        System.out.println("8: Fjern student\n");
    }

    public static void En() {
        System.out.println(Emne.hentMestPop().hentKode());
    }

    public static void To() {
        System.out.println(Emne.hentAktivStudent().hentNavn());
    }

    public static void Tre() {
        Emne.hentAlleStudenter();
    }

    public static void Fire(String navn) {
        if (Emne.sjekkOmStudentFinnes(navn)) {
            Student student = Emne.finnStudent(navn);
            student.hentEmner();
        } else {
            System.out.println("Studenten finnes ikke i systemet.");
        }
    }

    public static void Fem(String navn, String kode) {
        Emne emne = Emne.finnEmne(kode);
        Student student;
        if (emne != null) {
            if (Emne.sjekkOmStudentFinnes(navn)) {
                student = Emne.finnStudent(navn);
            } else {
                student = new Student(navn);
            }
            emne.leggTilStudent(student);
        } else {
            System.out.println("Emnet finnes ikke");
        }
    }

    public static void Seks(String navn, String kode) {
        Emne emne = Emne.finnEmne(kode);
        Student student;
        if (emne != null && Emne.sjekkOmStudentFinnes(navn)) {
            student = Emne.finnStudent(navn);
            student.leggTilEmne(emne);
        } else {
            System.out.println("Det har skjedd en feil");
        }
    }

    public static void Syv(String navn) {
        Student student = new Student(navn);
        Emne.leggTilStudentSystem(student);
    }

    public static void Aatte(String navn, String kode) {
        Emne emne = Emne.finnEmne(kode);
        if (emne != null && Emne.sjekkOmStudentFinnes(navn)) {
            Student student = Emne.finnStudent(navn);
            emne.fjernStudentFraEmne(student);
        } else {
            System.out.println("Det har skjedd en feil");
        }
    }

    public static void main(String[] args) throws Exception {
        File fil = new File("emnerstudenter.txt");
        Scanner leser = new Scanner(fil);
        String linje;
        Emne emne = null;
        
        while (leser.hasNextLine()) {
            linje = leser.nextLine();
            if (linje.charAt(0) == '*') {
                emne = new Emne(linje);
                linje = leser.nextLine();
            }
            Student student = new Student(linje);
            student.leggTilEmne(emne);
            emne.leggTilStudent(student);
        }
    
        Scanner tastatur = new Scanner(System.in);
        String input = "";
        String navn = "";
        String kode = "";
        hentInfo();
        while (!input.equals("q")) {
            input = tastatur.nextLine();
            if (input.equals("i")) {
                hentInfo();
            } else if (input.equals("1")) {
                En();
            } else if (input.equals("2")) {
                To();
            } else if (input.equals("3")) {
                Tre();
            } else if (input.equals("4")) {
                System.out.println("Navn:");
                navn = tastatur.nextLine();
                Fire(navn);
            } else if (input.equals("5")) {
                System.out.println("Navn:");
                navn = tastatur.nextLine();
                System.out.println("Kode:");
                kode = tastatur.nextLine();
                Fem(navn, kode);
            } else if (input.equals("6")) {
                System.out.println("Navn:");
                navn = tastatur.nextLine();
                System.out.println("Kode:");
                kode = tastatur.nextLine();
                Seks(navn, kode);
            } else if (input.equals("7")) {
                System.out.println("Navn:");
                navn = tastatur.nextLine();
                Syv(navn);
            } else if (input.equals("8")) {
                System.out.println("Navn:");
                navn = tastatur.nextLine();
                System.out.println("Kode:");
                kode = tastatur.nextLine();
                Aatte(navn, kode);
            } else {
                System.out.println("Forsto ikke kommando. <i> for info, <q> for avslutte");
            }
        }
    }
}
