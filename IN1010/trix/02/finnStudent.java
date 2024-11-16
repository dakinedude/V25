import java.util.HashMap;

class finnStudent {
    public static void main(String[] args) {
        HashMap<String, Integer> studenter = new HashMap<String, Integer>();
        
        String navn = "Espen Askeladd";
        studenter.put(navn, 123);

        if (studenter.containsKey(navn)) {
            System.out.println("Finnes");
        } else {
            System.out.println("Finnes ikke ");
        }

        
    }
}
