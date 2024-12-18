class Parkeringsplass<T> {
    T parkert = null;

    public void SettInn(T parkert) {
        this.parkert = parkert;
    }

    public T KjorUt() {
        T tmp = this.parkert;
        this.parkert = null;
        return tmp;
    }
}
