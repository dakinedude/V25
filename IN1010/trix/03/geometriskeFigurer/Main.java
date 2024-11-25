class Main {

    public static void main(String[] args) {
        Trekant t = new Trekant(3,2);
        Sirkel s = new Sirkel(3);
        Rektangel r = new Rektangel(3, 7);
        Kvadrat k = new Kvadrat(4);

        Figur[] figurer = {t, s, r, k};

        double sum = 0;

        for (Figur figur : figurer) {
            sum += figur.areal();
        }

        System.out.println(String.format("areal: %.2f", sum));
    }
}
