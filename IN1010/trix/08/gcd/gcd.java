class gcd {
    public static void main(String[] args) {
        System.out.println(gcd(48,18));
        System.out.println(gcd(101,103));
        System.out.println(gcd(270,192));
        System.out.println(gcd(0,15));
        System.out.println();
        System.out.println(gcdit(48,18));
        System.out.println(gcdit(101,103));
        System.out.println(gcdit(270,192));
        System.out.println(gcdit(0,15));
    }

    static int gcdit(int a, int b) {
        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int c = a % b;
        
        while (c != 0) {
            a = b;
            b = c;
            c = a % b;
        }

        return b;
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int c = a % b;

        if (c == 0) {
            return b;
        }
        return gcd(b, c);
    }
}
