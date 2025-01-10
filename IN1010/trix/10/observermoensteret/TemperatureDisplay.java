public class TemperatureDisplay implements Observer {
    private String temperature;

    @Override
    public void update(String temperature) {
        this.temperature = temperature;
        this.display();
    }

    private void display() {
        System.out.println("Current temperature: " + this.temperature);
    }
}
