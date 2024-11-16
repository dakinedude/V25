import java.util.Scanner;

class Produkt {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        String input;
        Scanner leser = new Scanner(System.in);

        System.out.print("Hva er verdien til x?\n> ");
        input = leser.nextLine();
        x = Integer.parseInt(input);
        
        System.out.print("Hva er verdien til y?\n> ");
        input = leser.nextLine();
        y = Integer.parseInt(input);

        z = produkt(x, y);
        System.out.println("x * y = " + z);

        diff(x, y);
    }

    static int produkt(int x, int y) {
        return x * y;
    }

    static void diff(int x, int y) {
        if ((x - y) < 0) {
            System.out.println("Differansen mellom x og y er negativ!");
        } else {
            System.out.println("Differansen er ikke negativ.");
        }
    }
}
        
