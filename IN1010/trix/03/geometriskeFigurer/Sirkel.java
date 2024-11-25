class Sirkel extends Figur {

    int radius;

    Sirkel(int radius) {
        this.radius = radius;
    }

    @Override
    double areal() {
        return 3.14 * this.radius * this.radius;
    }
}
