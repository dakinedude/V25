import java.util.Scanner;

class espressoMaskin {
    int espressoVann = 40;
    int lungoVann = 110;
    int vannTank = 1000;
    Scanner leser = new Scanner(System.in);
        
    public void lagEspresso() {
        if (vannTank - espressoVann > 0) {
            System.out.println("Her har du din espresso.");
            this.vannTank -= espressoVann;
        } else {
            this.spoer();
        }
    }

    public void spoer() {
        String lagre;
        System.out.println("Ikke nok vann. Fyll paa?\n> ");
        lagre = leser.nextLine();
        if (lagre.equals("ja")) {
            this.fyllVann();
        }
    }
    
    public void lagLungo() {
        if (vannTank - lungoVann > 0) {
            System.out.println("Her har du din lungo.");
            this.vannTank -= lungoVann;
        } else {
            this.spoer();
        }
    }

    public void fyllVann() {
        this.vannTank = 1000;
    }

    public int hentVannmengde() {
        return this.vannTank;
    }
}
