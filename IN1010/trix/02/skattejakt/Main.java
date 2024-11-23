import java.util.Scanner;
import java.io.File;

class Main {

    public static void main(String[] args) throws Exception {
        String filnavn = args[0];
        File fil = new File(filnavn);
        Skattejakt skattejakt = Skattejakt.lesInn(fil);
        skattejakt.skrivUt();

        Scanner input = new Scanner(System.in);
        String[] inputArray = new String[2];
        int[] intInput = new int[2];
        String data = "";
        
        while (!input.equals("q")) {
            skattejakt.skrivUt();
            data = input.nextLine();
            if (data.equals("q")) {
                break;
            } else {
                inputArray = data.split(" ");
            }

            for (int i = 0; i < inputArray.length; i++) {
                intInput[i] = Integer.parseInt(inputArray[i]);
            }

            if (skattejakt.sjekk(intInput[0], intInput[1])) {
                break;
            }
        }
    }
}
