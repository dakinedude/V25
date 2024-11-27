import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String data = "";
        
        while (!data.equals("q")) {
            System.out.println("`r` for registrer\n`i` for info om regnr\n`s` for summering av avgift paa eier.\n");

            data = input.nextLine();
            
            if (data.equals("r")) {
                System.out.println("`b` for buss\n`v` for varebil\n`p` for personbil");

                data = input.nextLine();

                if (data.equals("b")) {
                    System.out.println("Oppgi `regnr merke eier sitteplasser`");
                    data = input.nextLine();
                    String[] temp = data.split(" ");
                    new Buss(temp[0], temp[1], temp[2], Integer.parseInt(temp[3]));
                } else if (data.equals("v")) {
                    System.out.println("Oppgi `regnr merke eier lastevekt`");
                    data = input.nextLine();
                    String[] temp = data.split(" ");
                    new Varebil(temp[0], temp[1], temp[2], Integer.parseInt(temp[3]));
                } else if (data.equals("p")) {
                    System.out.println("Oppgi `regnr merke eier sitteplasser`");
                    data = input.nextLine();
                    String[] temp = data.split(" ");
                    new Personbil(temp[0], temp[1], temp[2], Integer.parseInt(temp[3]));
                } else {
                    System.out.println("Fant ikke kommando");
                }
            } else if (data.equals("i")) {
                System.out.println("Oppgi regnr:");
                data = input.nextLine();
                ArrayList<Kjoretoy> alle = Kjoretoy.alleKjoretoy();
                for (Kjoretoy kjoretoy : alle) {
                    if (data.equals(kjoretoy.hentRegnr())) {
                        System.out.println(kjoretoy.hentInfo());
                        break;
                    }
                }
            } else if (data.equals("s")) {
                System.out.println("Oppgi eiers navn:");
                data = input.nextLine();
                int sum = 0;
                ArrayList<Kjoretoy> alle = Kjoretoy.alleKjoretoy();
                for (Kjoretoy kjoretoy : alle) {
                    if (data.equals(kjoretoy.hentEier())) {
                        if (kjoretoy instanceof Personbil || kjoretoy instanceof Varebil) {
                            sum += kjoretoy.avgift();
                        }
                    }
                }
                System.out.println(sum);
            }
        }
    }
}
