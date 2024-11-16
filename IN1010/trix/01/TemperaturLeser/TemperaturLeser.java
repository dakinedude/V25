import java.util.Scanner;
import java.io.File;

public class TemperaturLeser {
    public static void main(String[] args) throws Exception {
        File fil = new File("Temperatur.txt");
        Scanner leser = new Scanner(fil);
        String data;
        String[] temperatur = new String[12]; 
        int cnt = 0;

        while (leser.hasNextLine()) {
            data = leser.nextLine();
            temperatur[cnt] = data;
            cnt++;
        }

        for (int i = 0; i < temperatur.length; i++) {
            System.out.println("i: " + i + ", tmp: " + temperatur[i]);
        }
    }
}
