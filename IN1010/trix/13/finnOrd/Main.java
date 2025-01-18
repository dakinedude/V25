import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        String ordet = args[0];
        File fil = new File(args[1]);
        int antTrader = Integer.parseInt(args[2]);
        Scanner leser = new Scanner(fil);
        String[] alleOrd = new String[Integer.parseInt(leser.nextLine())];

        int index = 0;
        while (leser.hasNextLine()) {
            alleOrd[index] = leser.nextLine().strip().strip().replaceAll("[^a-zA-Z0-9_-]", "").toLowerCase();
            index++;
        }
        leser.close();

        CountDownLatch latch = new CountDownLatch(antTrader);
        Monitor monitor = new Monitor();
        Thread[] trader = new Thread[antTrader];

        int norm = alleOrd.length / antTrader;
        int spec = alleOrd.length - (norm * (antTrader - 1));
        int cnt = 0;
        
        for (int i = 0; i < antTrader; i++) {
            String[] tmp;
            if (antTrader != 1) {
                if (i == antTrader - 1) {
                    tmp = new String[spec];
                } else {
                    tmp = new String[norm];
                }
                for (int j = 0; j < tmp.length; j++) {
                    tmp[j] = alleOrd[cnt];
                    cnt++;
                }
            } else {
                tmp = alleOrd;
            }
            trader[i] = new Thread(new Ordteller(monitor, latch, ordet, tmp));
            trader[i].start();
        }

        latch.await();

        System.out.println(String.format("%s forekommer %d ganger i filen", ordet, monitor.hentTilfeller()));
    }
}
