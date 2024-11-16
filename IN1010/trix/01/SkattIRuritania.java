import java.util.Scanner;

public class SkattIRuritania {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double inntekt;
        double skatt;

        System.out.print("Hva er inntekten din?\n> ");
        inntekt = Double.parseDouble(in.nextLine());

        if (inntekt < 10000) {
            skatt = inntekt * 0.10;
        } else {
            skatt = 0.10 * 10000 + 0.30 * (inntekt - 10000);
        }

        System.out.println("Du maa betale i skatt: " + skatt);
    }
}
