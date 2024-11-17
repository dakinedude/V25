class testBoks {
    public static void main(String[] args) {

        Boks boks1 = new Boks(3,3,3);
        Boks boks2 = new Boks(2,2,2);
        Boks boks3 = new Boks(1,1,0);

        assert boks1.beregnVolum() == 27 : "feil i boks1 volum";
        assert boks2.beregnVolum() == 8 : "feil i boks2 volum";
        assert boks3.beregnVolum() == 0 : "feil i boks3 volum";

        assert boks2.beregnAreal() == 2*2*2*3 : "feil i boks2 areal";
    }
}
