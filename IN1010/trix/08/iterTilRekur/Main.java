public class Main {
    public static void main(String[] args) {
        String[] strenger = {"IN1010", "er", "verdens", "beste", "fag!"};

        skrivUt(strenger);
    }

    public static void skrivUt(String[] strenger) {
        hjelper(strenger, 0);
    }

    public static void hjelper(String[] strenger, int i) {
        if (i == strenger.length) {
            return;
        }
        System.out.print(strenger[i] + " ");
        hjelper(strenger, i + 1);
        return;
    }
}
