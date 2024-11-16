public class ParametereB {
    public static void main(String[] args) {
        int b = 5;

        metodeTo(b);

        System.out.println(b);

    }

    public static int metodeTo(int b) {
        b = b + 2;
        return b;
    }
}

// Selv om int er immutable, returner metoden en peker til
// et nytt int-objekt, som er lik 5 + 2
// Men denne variabel lagres ikke i en ny variabel, saa
// 5 vil printes ut.
