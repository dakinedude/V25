class Main {
    public static void main(String[] args) {
        Student joakim = new Student("Joakim",0,0);
        Student kristin = new Student("Kristin",0,0);
        Student dag = new Student("Dag",0,0);

        for (int i = 0; i < 2; i++ ) {
            joakim.leggTilScore(2);
            kristin.leggTilScore(1);
            dag.leggTilScore(3);
        }

        System.out.println(joakim.hentScore());
        System.out.println(kristin.hentScore());
        System.out.println(dag.hentScore());
    }
}
