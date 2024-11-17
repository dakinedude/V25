import java.util.ArrayList;

class Brev {
    String avsender;
    String mottaker;
    ArrayList<String> linjer = new ArrayList<>();

    public Brev(String avsender, String mottaker) {
        this.avsender = avsender;
        this.mottaker = mottaker;
    }

    public void skrivLinje(String linje) {
        this.linjer.add(linje);
    }

    public void lesBrev() {
        System.out.println(String.format("Hei, %s\n", this.mottaker));
        for (String linje : this.linjer) {
            System.out.println(linje);
        }
        System.out.println("");
        System.out.println(String.format("Hilsen fra,\n%s", this.avsender));
    }
}
            
