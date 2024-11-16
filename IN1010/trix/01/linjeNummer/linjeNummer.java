import java.io.File;
import java.util.Scanner;

public class linjeNummer {
    public static void main(String[] args) throws Exception {
        File fil = new File("tekst.txt");
        Scanner leser = new Scanner(fil);
        String linje;

        for (int i = 1; leser.hasNextLine(); i++) {
            linje = leser.nextLine();
            System.out.println("# " + i + ":" + " " + linje);
        }
    }
}
