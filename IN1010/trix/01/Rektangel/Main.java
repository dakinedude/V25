public class Main {
    public static void main(String[] args) {
        Rektangel rektangelEn = new Rektangel(10, 10);
        Rektangel rektangelTo = new Rektangel(20, 20);

        System.out.println(rektangelEn.areal());
        System.out.println(rektangelTo.areal());

        rektangelEn.okLengde(5);
        rektangelTo.okBredde(10);

        System.out.println(rektangelEn.areal());
        System.out.println(rektangelTo.areal());

        System.out.println(rektangelEn.omkrets());
        System.out.println(rektangelTo.omkrets());

        rektangelEn.reduserLengde(5);
        rektangelTo.reduserBredde(10);

        System.out.println(rektangelEn.areal());
        System.out.println(rektangelTo.areal());

        rektangelEn.reduserLengde(500);
        rektangelTo.reduserBredde(1000);
    }
}
    
