class TestObserver {
    public static void main(String[] args) {
        WeatherStation w = new WeatherStation();
        w.setTemperature("23");
        Observer display1 = new TemperatureDisplay();
        Observer display2 = new TemperatureDisplay();
        w.addObserver(display1);
        w.addObserver(display2);
        w.setTemperature("24");

    }
}
