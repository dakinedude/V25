class Triangel {
    public static void main(String[] args) {
        triangel(3,5);
    }

    static void triangel(int m, int n) {
        if (m == n + 1) {
            return;
        }
        help(0, m);
        System.out.println();
        triangel(m + 1, n);
        help(0, m);
        System.out.println();
    }

    static void help(int i, int m) {
        if (i == m) {
            return;
        }

        System.out.print("*");
        help(i + 1, m);
    }
}
