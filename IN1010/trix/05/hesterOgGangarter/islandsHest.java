class islandsHest extends Hest implements KanToelte, KanPasse {

    public islandsHest(String navn, int alder) {
        super(navn, alder);
    }

    @Override
    public void toelt() {
        System.out.println(this.navn + " toelter.");
    }

    @Override
    public void pass() {
        System.out.println(this.navn + " passer.");
    }
}
    
