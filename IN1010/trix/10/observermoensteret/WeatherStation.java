import java.util.ArrayList;

public class WeatherStation implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private String temperature;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.temperature);
        }
    }

    public void setTemperature(String newTemp) {
        this.temperature = newTemp;
        this.notifyObservers();
    }
}
