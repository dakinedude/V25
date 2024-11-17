class Student {
    private String navn;
    private int score;
    private int antQuiz;

    public Student(String navn, int score, int antQuiz) {
        this.navn = navn;
        this.score = score;
        this.antQuiz = antQuiz;
    }

    public String hentNavn() {
        return this.navn;
    }

    public void leggTilScore(int score) {
        this.score += score;
    }

    public int hentScore() {
        return this.score;
    }

    public int gjSnitt() {
        return (this.score / this.antQuiz);
    }
}
    
