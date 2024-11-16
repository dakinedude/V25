import java.util.Scanner;

class Differanse {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner input = new Scanner(System.in);
        int output;

        System.out.print("Hva er verdien til x?\n> ");
        x = Integer.parseInt(input.nextLine());

        System.out.print("Hva er verdien til y?\n> ");
        y = Integer.parseInt(input.nextLine());

        output = diff(x, y);

        System.out.println("Differanse mellom " + x + " og " + y + " er: " + output);
    }

    static int diff(int x, int y) {
        int ret;

        if ((x - y) < 0) {
            ret = (x - y) * -1;
        } else {
            ret = x - y;
        }

        return ret;
    }
}
