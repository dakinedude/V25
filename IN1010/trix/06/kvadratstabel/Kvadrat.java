class Kvadrat {
    int sidelengde;
    public Kvadrat(int s) {
        this.sidelengde = s;
    }

    public String Info() {
        return String.format("Kvadrat med lengde %d og areal %d", this.sidelengde, this.areal());
    }

    public int areal() {
        return this.sidelengde * this.sidelengde;
    }
}
