import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        liste.add("hei");
        liste.add("hoho");
        liste.add("hihi");
        liste.add("hahahahah");
        liste.add("koki");
        liste.add("heipaadeg");
        Monitor m = new Monitor(liste, 'h');

        for (int i = 0; i < 3; i++) {
            Thread t = new Thread(new Bokstavteller(m));
            t.start();
        }
    }
}
