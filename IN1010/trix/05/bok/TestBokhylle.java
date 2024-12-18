class TestBokhylle {

    public static void main(String[] args) {

        try {
            Bokhylle bokhylle = new Bokhylle(3);
            System.out.println("Setter inn boeker:");

            String[] titler = {"De doedes tjern", "Doppler", "Doppler", "Misery", "Gone with the Wind"};

            for (int i = 0; i < titler.length; i++) {
                bokhylle.settInn(new Bok(titler[i]));
            }

            System.out.println("\nSkriver ut boeker:");
            bokhylle.skrivBoeker();
        } catch (IkkeMerPlassException e) {
            System.out.println(e);
        } catch (DuplikatException e) {
            System.out.println(e);
        }
    }
}
