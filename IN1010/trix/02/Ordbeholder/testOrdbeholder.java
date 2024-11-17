import java.util.ArrayList;

class testOrdbeholder {
    public static void main(String[] args) {
        Ordbeholder test = new Ordbeholder();
        assert test.pop() == null;
        System.out.println("Test 1 fullfoert");
        assert test.settInn("test1");
        System.out.println("Test 2 fullfoert");
        assert !test.settInn("test1");
        System.out.println("Test 3 fullfoert");
        test.settInn("hei");
        System.out.println("Test 4 fullfoert");
        test.settInn("hoho");
        System.out.println("Test 5 fullfort");
        assert test.antallOrd() == 3;
        System.out.println("Test 6 fullfoert");
        assert test.pop().equals("hoho");
        System.out.println("Test 7 fullfoert");
        assert test.antallOrd() == 2;
        System.out.println("Test 8 fullfoert");
    }
}
        
        
        
