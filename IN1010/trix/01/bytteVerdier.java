// Oppgaven er hentet fra Big Java: Late objects R5.14
public class bytteVerdier {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int[] ret = variabelBytte(x,y);
        System.out.println(ret[0] + " " + ret[1]);
    }

    public static int[] variabelBytte(int a, int b ) {
        int[] ret = new int[2];
        int temp = a;
        a = b;
        b = temp;
        ret[0] = a;
        ret[1] = b;
        return ret; 
    }
}
// Den fungerer ikke, fordi variabelBytte() ikke returnerer noe
// Java tillater ikke returnering av flere variabler.
// Vi maa returnere et array.
