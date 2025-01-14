import java.util.Scanner;

class Tradklokke {
    public static void main(String[] args) {
        Scanner minInn = new Scanner(System.in);
        Runnable minRun = new RunStoppekl();
        Thread traden = new Thread(minRun);
        System.out.println("Stoppeklokke");
        System.out.println("Trykk CR for start og slutt");
        minInn.nextLine();
        traden.start();
        minInn.nextLine();
        traden.interrupt();
        System.out.println("Takk for naa");
    }
}
