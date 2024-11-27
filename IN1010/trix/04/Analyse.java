class S {}
class G extends S {}
class Q extends B {}
class B extends S {}

class Analyse {
    public static void main(String[] args) {
        S q = new G();
        Q b = new Q();
        B s = new Q();
        B g = new B();
        S p = new B();

  

        System.out.println(q instanceof B);
        System.out.println(q instanceof G);
        System.out.println(q instanceof S);
        System.out.println(b instanceof B);
        System.out.println(b instanceof S);
        System.out.println(s instanceof B);
        System.out.println(g instanceof Q);
        System.out.println(g instanceof S);
        System.out.println(p instanceof Q);
        System.out.println(p instanceof S);
        System.out.println(p instanceof G);

    }
}
