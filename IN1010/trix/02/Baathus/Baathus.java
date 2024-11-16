class Baathus {
    Baat[] baatListe;
    int antallPlasser;
    
    public Baathus(int antallPlasser) {
        this.antallPlasser = antallPlasser;
        baatListe = new Baat[antallPlasser];
    }

    public void settInn(Baat baat) {
        boolean check = true;
        for (int i = 0; i < baatListe.length; i++) {
            if (baatListe[i] == null) {
                baatListe[i] = baat;
                check = true;
                System.out.println("Satte inn " + baat.hentInfo());
                break;
            } else {
                check = false;
            }
        }

        if (!check) {
            System.out.println("Ikke nok plass.");
        }
    }

    public void skrivBaater() {
        for (Baat baat : baatListe) {
            System.out.println(baat.hentInfo());
        }
    }
}

    
