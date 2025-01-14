class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        Bygning b = new Bygning(x,y);
        Skyskraper s = new Skyskraper(50, 30, 15);

        b.infoBygning();
        s.infoSkyskraper();
        s.infoBygning();

        // 1. Skyskraper arver fra bygninger
        // 2. super() initialiserer konstruktoeren fra foreldreklassen
        // 3. Vi legger antall etasjoner iinn i super(), som kaller konstruktoeren i Bygning-klassen
    }
}
            
