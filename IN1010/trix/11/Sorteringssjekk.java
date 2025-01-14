public class Sorteringssjekk {
    public static boolean erSortert(String[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i].compareTo(A[i+1]) > 0) {
                return false;
            }
        }
        return true;
    }

    // betingelser:
    // foer hver iterasjon, arrayet er sortert fra 0 til i.
    // foerbetingelser:
    // arrayet er av String-objekter. trenger ikke vaere sortert.
    // etterbetingelser:
    // hvis sortert, returnerer true,
    // ellers, false.

    public static boolean erSortertRek(String[] A) {
        return hjelp(A, 0);
    }

    private static boolean hjelp(String[] A, int i) {
        if (i == A.length - 1) {
            return true;
        }

        if (A[i].compareTo(A[i+1]) > 0) {
            return false;
        }

        return hjelp(A, i+1);
    }
}
