class FemTilTusen implements Runnable {
    private int min = 5;
    private int max = 1000;

    @Override
    public void run() {
        while (min < max) {
            if (min % 10 == 0) {
                System.out.println("FemTilTusen: " + min);
            }
            min++;
        }
    }
}
