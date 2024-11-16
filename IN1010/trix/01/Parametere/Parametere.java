public class Parametere {
    public static void main(String[] args) {

        String c = "hei! ";
        String d = metodeTre(c);

        System.out.println(c);
        System.out.println(d);

    }

    public static String metodeTre(String noe) {
        noe = noe + "og hallo!";
        return noe;
    }
}

// Den foerste println vil printe "hei! "
// Den andre metoden returnerer en peker til "hei! og hallo!",
// saa dette er hva printes ut av den andre println.
