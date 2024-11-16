class Rektangel {
    double l;
    double b;

    public Rektangel(double l, double b) {
        
        this.l = l;
        this.b = b;
    }

    public void okLengde(int okning) {
        this.l += okning;
    }

    public void okBredde(int okning) {
        this.b += okning;
    }

    public double areal() {
        return this.l * this.b;
    }

    public double omkrets() {
        return 2 * this.l + 2 * this.b;
    }

    public void reduserLengde(int redusering) {
        if (this.l - redusering < 0) {
            System.out.println("Det gaar ikke");
        } else {
            this.l -= redusering;
        }
    }

    public void reduserBredde(int redusering) {
        if (this.b - redusering < 0) {
            System.out.println("Det gaar ikke");
        } else {
            this.b -= redusering;
        }
    }
}
