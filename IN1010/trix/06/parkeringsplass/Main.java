class Main {
    public static void main(String[] args) {
        Bil b = new Bil("123", 4);
        Motorsykkel m = new Motorsykkel("456", 400);
        Parkeringsplass<Bil> pb = new Parkeringsplass<Bil>();
        Parkeringsplass<Motorsykkel> pm = new Parkeringsplass<Motorsykkel>();

        pb.SettInn(b);
        pm.SettInn(m);
        pb.KjorUt();
        System.out.println(b.ToString());
        System.out.println(m.ToString());

        Parkeringshus ph = new Parkeringshus();

        ph.etasje1[0] = new Parkeringsplass();
        ph.etasje1[0].SettInn(m);
        Motorsykkel m1;
        m1 = (Motorsykkel) ph.etasje1[0].KjorUt();
        System.out.println(m1.ToString());
    }
}
      
       
    
