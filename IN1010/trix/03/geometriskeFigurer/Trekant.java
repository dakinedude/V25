class Trekant extends Figur {
    int grunnlinje;
    int hoyde;

    Trekant(int g, int h) {

        this.grunnlinje = g;
        this.hoyde = h;
    }

    @Override
    double areal() {
        return (this.grunnlinje * this.hoyde) / 2;
    }

}
