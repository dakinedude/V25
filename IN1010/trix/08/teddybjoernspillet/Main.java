class Main {
    public static void main(String[] args) {
        System.out.println(teddy(20));
        System.out.println(teddy(42));
        System.out.println(teddy(84));
        System.out.println(teddy(53));
        System.out.println(teddy(41));
    }

    static boolean teddy(int n) {
        if (n == 42) {
            return true;
        }

        if (n < 42) {
            return false;
        }

        if (n % 2 == 0) {
            if (teddy(n / 2)) {
                return true;
            }
        }

        if (n % 3 == 0 || n % 4 == 0) {
            if (teddy(n - ((n % 10) * ((n % 100)/10)))) {
                return true;
            }
        }

        if (n % 5 == 0) {
            if (teddy(n - 42)) {
                return true;
            }
        }

        return false;
    }
}
