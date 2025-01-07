import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;

class Main {
    public static void main(String[] args) throws Exception {
        String filnavn = args[0];
        String nyFilnavn = args[1];
        File fil = new File(filnavn);
        Scanner leser = new Scanner(fil);
        ArrayList<CDAlbum> liste = new ArrayList<CDAlbum>();

        while (leser.hasNextLine()) {
            String[] data = leser.nextLine().split(",");
            liste.add(new CDAlbum(data[0], data[1], data[2]));
        }

        CDAlbum temp;
        
        for (int i = 0; i < liste.size(); i++) {
            for (int j = 0 + i; j < liste.size(); j++) {
                if (liste.get(i).compareTo(liste.get(j)) == 1) {
                    temp = liste.get(i);
                    liste.set(i, liste.get(j));
                    liste.set(j, temp);
                }
            }
        }

        FileWriter skriver = new FileWriter(nyFilnavn);
        for (CDAlbum c : liste) {
            skriver.write(String.format("%s %n", c.toString()));
        }
        skriver.close();
    }
}
