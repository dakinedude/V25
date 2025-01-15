class Servitor implements Runnable {
    private FellesBord bord;
    private final int ANTALL;
    private int servert = 0;

    Servitor(FellesBord bord, int ant) {
        this.bord = bord;
        this.ANTALL = ant;
    }

    @Override
    public void run() {
        try {
            while (servert < ANTALL) {
                servert++;
                bord.hentTallerken();
                System.out.println("Serverer nr: " + servert);
                Thread.sleep((long) (1100 * Math.random()));
            }
        } catch (InterruptedException e) {
            System.out.println("Uventet stopp 2");
        }
    }
}
