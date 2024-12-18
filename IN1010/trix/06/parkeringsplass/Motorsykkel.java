class Motorsykkel implements toString {
    private String nr;
    private int str;

    public Motorsykkel(String nr, int str) {
        this.nr = nr;
        this.str = str;
    }

    @Override
    public String ToString() {
        return String.format("%s, %d", this.nr, this.str);
    }
        
}
