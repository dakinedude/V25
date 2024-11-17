import java.util.HashMap;

class Telefonbok {
    public static void main(String[] args) {
        Person mats = new Person("Mats", "123456789", "Hohoveien 32");
        Person ole = new Person("Ole", "55555123", "Gate nr 2");
        Person nils = new Person("Nils", "88138123", "Dronningveien 3");

        HashMap<String,Person> ordbok = new HashMap<>();
        Person[] personer = new Person[10];

        personer[0] = mats;
        personer[1] = ole;
        personer[2] = nils;

        ordbok.put("Mats", mats);
        ordbok.put("Ole", ole);
        ordbok.put("Nils", nils);

        for (Person person : personer) {
            if (person != null) {
                person.skrivInfo();
            }
        }

        for (String key : ordbok.keySet()) {
            ordbok.get(key).skrivInfo();
        }
    }
}
