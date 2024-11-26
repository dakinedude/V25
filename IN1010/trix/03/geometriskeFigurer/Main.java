class Main {

    public static void main(String[] args) {
        Figur t = new Trekant(3,2);
        Figur s = new Sirkel(3);
        Figur r = new Rektangel(3, 7);
        Figur k = new Kvadrat(4);

        Figur[] figurer = {t, s, r, k};

        double sum = 0;

        for (Figur figur : figurer) {
            sum += figur.areal();
        }

        System.out.println(String.format("areal: %.2f", sum));
    }
}
