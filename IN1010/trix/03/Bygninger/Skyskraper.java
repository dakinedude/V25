class Skyskraper extends Bygning {
    int etasjer;
    
    public Skyskraper(int hoyde, int areal, int etasjer) {
        super(hoyde, areal);
        this.etasjer = etasjer;
    }
    public void infoSkyskraper() {
        System.out.println(String.format("h: %d a: %d e: %d", this.hoyde, this.areal, this.etasjer));
    }
}
