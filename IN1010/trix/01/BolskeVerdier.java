public class BolskeVerdier {
    public static void main(String[] args) {
        boolean sann = true;
        boolean falsk = false;

        System.out.println(sann);
        System.out.println(falsk);

        // test en

        if (sann) {
            System.out.println("Foerste test slo til");
        }

        if (!falsk) {
            System.out.println("Andre test slo til");
        } 

        if (sann == falsk) {
            System.out.println("Sann er falsk");
        } else {
            System.out.println("Sann og falsk er ulike");
        }
    }
}
