class Buss extends Kjoretoy {

    protected int sitteplasser;

    public Buss(String regnr, String merke, String eier, int sitteplasser) {
        super(regnr, merke, eier);
        this.sitteplasser = sitteplasser;
        alle.add(this);
    }

    @Override
    public String hentInfo() {
        return String.format("Buss av type %s med regnr %s og eier %s og %d sitteplasser", this.merke, this.regnr, this.eier, this.sitteplasser);
    }
}
