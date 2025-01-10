import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        Beholder b = new Beholder();
        b.add("Hei");
        b.add("paa");
        b.add("deg");
        b.add("din");
        b.add("gamle");
        b.add("sei");
        b.add("!!!");

        Iterator<String> itr = b.iterator();
        
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
