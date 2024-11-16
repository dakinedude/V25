import java.util.HashMap;

class hashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> ordBok = new HashMap<Integer, String>();
        String[] verdier = {"en", "to", "tre", "fire", "fem"};
        
        for (int i = 0; i < 5; i++) {
            ordBok.put(i + 1, verdier[i]);
        }

        for (int i = 1; i < ordBok.size() + 1; i++) {
            System.out.println(i + " " + ordBok.get(i));
        }

        System.out.println(ordBok.get(5));
        System.out.println(ordBok.get(3));

        ordBok.put(3,"hei");
        System.out.println(ordBok.get(3));
        System.out.println(ordBok.get(1));
        ordBok.remove(1);
        System.out.println(ordBok.get(1));
        ordBok.remove(1);
        System.out.println(ordBok.get(1));

        for (int i: ordBok.keySet()) {
            System.out.println(i + ordBok.get(i));
        }

        for (String s: ordBok.values()) {
            System.out.println(s);
        }
                
               

        
    }
}
            


        
