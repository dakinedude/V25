class Utskrift {
    public static void main(String[] args) {
        skrivUt(0);
        System.out.println();
        skrivUt(4);
        System.out.println();
        skrivUt(27);
    }

    static void skrivUt(int n) {
        if (n == 0) {
            System.out.print(0);
        } else {
            if (n > 1) {
                skrivUt(n / 2);
            }
            System.out.print(n % 2);
        }
    }
}
