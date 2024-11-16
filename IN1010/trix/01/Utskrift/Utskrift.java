import java.util.Scanner;

public class Utskrift {
    public static void utskrift(String tekst) {
        System.out.println(tekst);
    }

    public static void utskrift(int n, int m) {
        System.out.println(n + m);
    }

    public static void main(String[] args) {
        String tekst = "hei";
        int n = 3;
        int m = 4;
        utskrift(tekst);
        utskrift(n, m);
    }
}

        
