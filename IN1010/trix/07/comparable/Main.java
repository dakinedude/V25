class Main {
    public static void main(String[] args) {
        Katt k1 = new Katt("h",1);
        Katt k2 = new Katt("j",2);
        Katt k3 = new Katt("q",3);
        Katt k4 = new Katt("s",4);
        Katt k5 = new Katt("a",4);

        Katt[] katter = {k1,k2,k3,k4,k5};

        Katt eldst = null;

        for (Katt katt : katter) {
            if (eldst == null) {
                eldst = katt;
            } else {
                if (katt.compareTo(eldst) == 1) {
                    eldst = katt;
                }
            }
        }
        System.out.println(eldst.toString());
    }
}
