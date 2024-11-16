import java.util.Scanner;

public class Sammenlign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;

        System.out.print("Hva er a? ");
        a = Integer.parseInt(in.nextLine());
        System.out.print("Hva er b? ");
        b = Integer.parseInt(in.nextLine());

        if (a > b) {
            System.out.println(a + " er stoerre enn " + b);
        } else {
            System.out.println(a + " er ikke stoerre enn " + b);
        }
    }
}
