class Bil implements toString {
    private String nr;
    private int seter;
       
    public Bil(String nr, int seter) {
        this.nr = nr;
        this.seter = seter;
    }

    @Override
    public String ToString() {
        return String.format("%s, %d", this.nr, this.seter);
    }
}
