import java.util.*;

public class Artsdatabanken {
    public static void main(String[] args) {
        HashSet<Dyr> dyr = new HashSet<>();
        HashMap<String, HashSet<Dyr>> dyreriket = new HashMap<>();
        HashSet<String> kjennetegn = new HashSet<>();

        // implisitt casting -- kan ikke bruke billens metoder, med mindre vi typekonverterer den tilbake
        // bare variabler og metoder til dyr
        Dyr g1 = new GranbarkBille(kjennetegn);
        System.out.println("Antall individer av billen: " + GranbarkBille.hentAntall());
        // bare variabler og metoder til insekt
        Insekt g2 = new GranbarkBille(kjennetegn);
        System.out.println("Antall individer av billen: " + GranbarkBille.hentAntall());
        // variabler og metoder til billen
        GranbarkBille g3 = new GranbarkBille(kjennetegn);
        System.out.println("Antall individer av billen: " + GranbarkBille.hentAntall());
        dyr.add(g1);
        dyr.add(g2);
        dyr.add(g3);

        // eksplisitt casting (ovenfra og ned)
        GranbarkBille g4 = (GranbarkBille) g1;
        System.out.println(g4.gnagMorgang());
        System.out.println(g4.getClass());

        for (Dyr d : dyr) {
            if (d instanceof Insekt) {
                if (!dyreriket.keySet().contains(Insekt.KLASSE)) {
                    HashSet<Dyr> insekter = new HashSet<>();
                    dyreriket.put(Insekt.KLASSE, insekter);
                }
                dyreriket.get(Insekt.KLASSE).add(d);
            }
        }

        for (Dyr insekt : dyreriket.get(Insekt.KLASSE)) {
            if (insekt instanceof GranbarkBille) {
                GranbarkBille gbb = (GranbarkBille) insekt;
                String morgang = gbb.gnagMorgang();
                System.out.println(morgang);
            }
        }
    }
}
