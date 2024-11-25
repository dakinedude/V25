class Rektangel extends Figur {

    int lengde;
    int bredde;
    
    Rektangel(int lengde, int bredde) {
        this.lengde = lengde;
        this.bredde = bredde;
    }

    @Override
    double areal() {
        return this.lengde * this.bredde;
    }

}
