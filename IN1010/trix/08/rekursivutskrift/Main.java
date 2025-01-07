class Main {
    public static void main(String[] args) {
        rekursivUtskrift(1);
    }

    public static void rekursivUtskrift(int i) {
        if (i >= 11) {
            return;
        }

        System.out.println(i);

        rekursivUtskrift(i + 1);
    }
}
