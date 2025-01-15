class Kokk implements Runnable {
    private FellesBord bord;
    private final int ANTALL;
    private int laget = 0;

    Kokk(FellesBord bord, int ant) {
        this.bord = bord;
        this.ANTALL = ant;
    }

    @Override
    public void run() {
        try {
            while (laget < ANTALL) {
                laget++;
                System.out.println("Kokken lager tallerken nr: " + laget);
                bord.settTallerken();
                Thread.sleep((long) (600 * Math.random()));
            }
        } catch (InterruptedException e) {
            System.out.println("Uventet stopp 1");
        }
    }
}
