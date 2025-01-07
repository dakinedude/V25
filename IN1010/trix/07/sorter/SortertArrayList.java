import java.util.ArrayList;

class SortertArrayList<T extends Comparable<T>> {
    ArrayList<T> liste = new ArrayList<T>();

    public void SettInn(T data) {
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) != null) {
                if (liste.get(i).compareTo(data) == 1) {
                    T tmp = liste.remove(i);
                    liste.add(i, data);
                    this.SettInn(tmp);
                    return;
                } else {
                    continue;
                }
            }
        }
        this.liste.add(data);
    }

    public T HentUtFoerste() {
        return liste.remove(0);
    }

    public T Hent(int i) {
        return liste.get(i);
    }
}
