class pasoFino extends Hest implements KanPasse {

    public pasoFino(String n, int a) {
        super(n, a);
    }

    @Override
    public void pass() {
        System.out.println(this.navn + " passer.");
    }
}
    
