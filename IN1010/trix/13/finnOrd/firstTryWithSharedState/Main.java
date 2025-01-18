import java.io.File;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        String ord = args[0];
        String filnavn = args[1];
        int antTrader = Integer.parseInt(args[2]);

        File fil = new File(filnavn);
        Scanner leser = new Scanner(fil);

        int i = 0;
        String[] alleOrd;
        alleOrd = new String[Integer.parseInt(leser.nextLine())];

        while (leser.hasNextLine()) {
            alleOrd[i] = leser.nextLine().strip().toLowerCase();
            i++;
        }

        Monitor m = new Monitor(alleOrd);

        for (int j = 0; j < antTrader; j++) {
            Thread t = new Thread(new Ordsjekk(m, ord));
            t.start();
        }

        // IKKE bra ... busy waiting
        while (m.hentForekomst() == 0) {
            continue;
        }

        System.out.println("hei " + m.hentForekomst());
    }
}
