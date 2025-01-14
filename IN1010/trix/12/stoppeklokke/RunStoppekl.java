class RunStoppekl implements Runnable {
    @Override
    public void run() {
        int klokke = 0;
        try {
            while (true) {
                Thread.sleep(1000);
                System.out.println(klokke);
                klokke++;
            }
        } catch (InterruptedException e) {
            System.out.println("Klokken er ferdig");
        }
    }
}
