import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Gruppeoppmoete {

    private String[] navn = new String[17];
    private boolean[] oppmoete = new boolean[17];

    public Gruppeoppmoete(String filnavn) throws Exception {
        File fil = new File(filnavn);
        Scanner leser = new Scanner(fil);
        String data;
        int i = 0;
        
        while (leser.hasNextLine()) {
            data = leser.nextLine();
            this.navn[i] = data;
            this.oppmoete[i] = true;
            i++;
        }
        
    }

    public boolean registrerOppmoete(String sjekk) {
        boolean found = false;
        int i = 0;
        for (String person : this.navn) {
            if (sjekk.equals(person)) {
                found = true;
                break;
            }
            i++;
        }

        if (found) {
                if (this.oppmoete[i]) {
                    System.out.println(String.format("%s er oppmoett", sjekk));
                    return true;
                }
        }
        System.out.println(String.format("%s er ikke oppmoett", sjekk));
        return false;
    }
    
                   
    public void skrivUt() {
        String status = "";
        String navn = "";

        for (int i = 0; i < this.navn.length; i++) {
            navn = this.navn[i];
            if (this.oppmoete[i]) {
                status = "oppmoett";
            } else {
                status = "ikke oppmoett";
            }

            System.out.println(String.format("%s er %s", navn, status));
        }
    }
}
