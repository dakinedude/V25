import java.util.HashMap;
import java.util.Scanner;

class Telefonbok {
    public static void main(String[] args) {
        HashMap<String, String> telefonbok = new HashMap<>();
        Scanner leser = new Scanner(System.in);
        String input = "";
        
        telefonbok.put("Arne", "22334455");
        telefonbok.put("Lisa", "95959595");
        telefonbok.put("Jonas", "97959795");
        telefonbok.put("Peder", "12345678");

        while (!input.equals("q")) {
            input = leser.nextLine();
            if (telefonbok.keySet().contains(input)) {
                System.out.println(telefonbok.get(input));
            }
        }

        for (String keys : telefonbok.keySet()) {
            System.out.println(keys + " " + telefonbok.get(keys));
        }
    }
}

        
