import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws Exception {
        File fil = new File("navn.txt");
        Scanner leser = new Scanner(fil);
        ArrayList<Person> personer = new ArrayList<Person>();
        ArrayList<Hund> hunder = new ArrayList<Hund>();
        String linje;
        
        while (leser.hasNextLine()) {
            linje = leser.nextLine();
            if (linje.charAt(0) == 'P') {
                linje = linje.replace("P ", "");
                if (linje.contains(" ")) {
                        String[] temp = linje.split(" ");
                        linje = temp[0];
                    }
                Person person = new Person(linje);
                personer.add(person);
            } else {
                linje = linje.replace("H ", "");
                if (linje.contains(" ")) {
                        String[] temp = linje.split(" ");
                        linje = temp[0];
                    }
                Hund hund = new Hund(linje);
                hunder.add(hund);
            }
        }

        System.out.println("Hunder:");
        for (Hund hund : hunder) {
            System.out.println(hund.hentNavn());
        }

        System.out.println("Personer:");
        for (Person person : personer) {
            System.out.println(person.hentNavn());
        }
    }
}
