import java.util.ArrayList;

public class koSystem {

    private ArrayList<koLapp> ko = new ArrayList<>();
    private int nr = 1;

    public void trekkKoLapp() {
        this.ko.add(new koLapp(this.nr));
        this.nr += 1;
        System.out.println(String.format("Du faar tildelt billetnr %d", this.ko.get(ko.size() - 1).hentNummer()));
        System.out.println(String.format("Det staar %d foran deg", (this.ko.size() - 1)));
    }

    public void betjenKunde() {
        if (ko.size() != 0) {
            koLapp temp = this.ko.remove(0);
            System.out.println(String.format("Kunde med billettnr. %d blir betjent", temp.hentNummer()));
        } else {
            System.out.println("Koen er tom");
        }
    }

    public void antKunder() {
        System.out.println(String.format("Det staar %d personer i ko", this.ko.size()));
    }

    public void printKunder() {
        System.out.println("Disse venter i ko:");
        for (koLapp lapp : this.ko) {
            System.out.println(lapp.hentNummer());
        }
    }
}


    
