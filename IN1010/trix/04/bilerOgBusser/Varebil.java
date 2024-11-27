class Varebil extends Kjoretoy implements Skatt {

    protected int lastevekt;

    public Varebil(String regnr, String merke, String eier, int lastevekt) {
        super(regnr, merke, eier);
        this.lastevekt = lastevekt;
        alle.add(this);
    }

    @Override
    public int avgift() {
        return 4 * lastevekt;
    }

    public String hentInfo() {
        return String.format("varebil med %d lastevekt av type %s. Eies av %s og har regnr %s. Avgift: %d", this.lastevekt, this.merke, this.eier, this.regnr, this.avgift());
    }
}
