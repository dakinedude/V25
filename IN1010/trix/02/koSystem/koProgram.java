import java.util.Scanner;

class koProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String data = "";
        koSystem system = new koSystem();
        
        while (!data.equals("4")) {
            System.out.println("***MENY FOR BILETTSYSTEM***");
            System.out.println("1 - Trekk ny kolapp");
            System.out.println("2 - Betjent kunde");
            System.out.println("3 - Print antall kunder i ko");
            System.out.println("4 - Avslutt");

            data = input.nextLine();

            if (data.equals("1")) {
                system.trekkKoLapp();
            } else if (data.equals("2")) {
                system.betjenKunde();
            } else if (data.equals("3")) {
                system.antKunder();
                system.printKunder();
            } else if (data.equals("4")) {
                break;
            }
        }
    }
}
        
