class Main {
    public static void main(String[] args) {
        Bjorn b = new Bjorn();
        Ulv u = new Ulv();
        Elg e = new Elg();
        Sau s = new Sau();

        Rovdyr[] rovdyr = {b, u};
        Planteeter[] planteetere = {e, s};

        for (Rovdyr rovdyret : rovdyr) {
            rovdyret.jakte();
        }

        for (Planteeter planteeter : planteetere) {
            planteeter.beskytte();
        }
    }
}
