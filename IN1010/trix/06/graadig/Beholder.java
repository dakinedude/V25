class Beholder<T extends Comparable<T>> {
    T thing = null;

    public T settInn(T ny) {
        if (this.thing == null) {
            this.thing = ny;
            return null;
        }
        if (this.thing.compareTo(ny) == -1) {
            T ret = this.thing;
            this.thing = ny;
            return ret;
        }
        return null;
    }

    public T hent() {
        return this.thing;
    }
}
