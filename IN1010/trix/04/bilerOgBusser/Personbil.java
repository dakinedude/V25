class Personbil extends Kjoretoy implements Skatt {

    protected int sitteplasser;

    public Personbil(String regnr, String merke, String eier, int sitteplasser) {
        super(regnr, merke, eier);
        this.sitteplasser = sitteplasser;
        alle.add(this);
    }

    @Override
    public int avgift() {
        return 3000;
    }

    public String hentInfo() {
        return String.format("Personbil med %d sitteplasser av type %s. Eies av %s og har regnr %s. Avgift: %d", this.sitteplasser, this.merke, this.eier, this.regnr, this.avgift());
    }
}
