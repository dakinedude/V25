import java.util.Random;
import java.util.HashSet;

public class GranbarkBille extends Insekt {
    public final static String ART = "Ips Typografus";
    private static int antall = 0;
    private int antallEgg;
    private String kjoenn;
    private static Random random = new Random();

    public static int hentAntall() {
        return antall;
    }

    public GranbarkBille(HashSet<String> kjennetegn) {
        super(kjennetegn);
        antallEgg = 0;
        if (random.nextDouble() > 0.5) {
            kjoenn = "hunn";
        } else {
            kjoenn = "hann";
        }
        antall++;
    }

    public static void oppdaterAntall(int differanse) {
        if (antall + differanse >= 0) {
            antall += differanse;
        } else {
            antall = 0;
        }
    }
    private void leggEgg() {
        antallEgg += random.nextInt(40, 81);
    }

    public String gnagMorgang() {
        String morgang = "\n";
        if (this.kjoenn.equals("hunn")) {
            int lengde = random.nextInt(15) + 10;

            for (int i = 0; i < lengde; i++) {
                morgang += "~";

                if (random.nextDouble() < 0.3) {
                    this.leggEgg();
                    morgang += "0";
                }
            }
        } else {
            morgang += "Jeg er en hann ...";
        }

        morgang += "\n";
        return morgang;
    }

    @Override
    public void leggTilKjennetegn(String k) {
        this.kjennetegn.add(k);
    }
}
