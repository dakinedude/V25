import java.util.Scanner;

public class MindreStorre {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Tast inn et tall:\n> ");
        n = input.nextInt();

        if (n <= 10) {
            System.out.println(n + " er mindre eller stoerre enn 10.");
        } else if (n <= 20) {
            System.out.println(n + " er mindre eller stoerre enn 20.");
        } else {
            System.out.println(n + " er stoerre enn 20");
        }
    }
} 
