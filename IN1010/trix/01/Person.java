public class Person {
    String navn;
    int alder;

    public Person(String n, int a) {

        navn = n;
        alder = a;
    }
   
    public void endreNavn(String n) {
        navn = n;
    }

    public void endreAlder(int a) {
        alder = a;
    }
}
