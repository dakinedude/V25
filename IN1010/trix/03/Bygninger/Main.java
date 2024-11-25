class Main {
    public static void main(String[] args) {
        Bygning b = new Bygning(20, 40);
        Skyskraper s = new Skyskraper(50, 30, 15);

        b.infoBygning();
        s.infoSkyskraper();
        s.infoBygning();

        // 1. Skyskraper arver fra bygninger
        // 2. super() initialiserer konstruktoeren fra foreldreklassen
        // 3. Vi legger antall etasjoner iinn i super(), som kaller konstruktoeren i Bygning-klassen
    }
}
            
