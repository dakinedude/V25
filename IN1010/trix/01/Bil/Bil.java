public class Bil {
    private String eier;
    private String merke;

    public Bil(String eier, String merke){ 
        this.eier = eier;
        this.merke = merke;
    }

    public void skrivUt() {
        System.out.println("Eier: " + this.eier + "\nMerke: " + this.merke);
    }
}

