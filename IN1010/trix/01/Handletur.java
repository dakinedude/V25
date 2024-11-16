import java.util.Scanner;

class Handletur {
    public static void main(String[] args) {
        // int brod = 20;
        // int melk = 15;
        // int ost = 40;
        // int yoghurt = 12;

        Scanner input = new Scanner(System.in);
        int sum = 0;

        String[] varer = {"brod", "melk", "ost", "yoghurt"};
        int[] priser = {20, 15, 40, 12};

        System.out.println("Hei! Velkommen til IFI-butikken.");

        for (int i = 0; i < varer.length; i++) {
            System.out.print("Hvor mange " + varer[i] + " vil du ha?\n> ");
            sum += priser[i] * Integer.parseInt(input.nextLine());
        }

        System.out.println("Du skal betale: " + sum + "kr");
    }
}
