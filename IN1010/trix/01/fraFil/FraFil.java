import java.io.File;
import java.util.Scanner;

public class FraFil {
    public static void main(String[] args) throws Exception {
        File fil = new File("tekst.txt");
        Scanner scanner = new Scanner(fil);
        String data;
        while (scanner.hasNextLine()) {
            data = scanner.nextLine();
            System.out.println(data);
        }
        scanner.close();
    }
}
