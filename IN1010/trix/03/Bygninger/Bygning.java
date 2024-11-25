class Bygning {
    int hoyde;
    int areal;
    
    public Bygning(int hoyde, int areal) {
        this.hoyde = hoyde;
        this.areal = areal;
    }

    public void infoBygning() {System.out.println(String.format("h: %d a: %d", this.hoyde, this.areal));}
}
