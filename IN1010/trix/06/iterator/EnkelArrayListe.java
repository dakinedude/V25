import java.util.Iterator;

class EnkelArrayListe implements Iterator<String> {
    String[] array;
    private int i = 0;

    public EnkelArrayListe(int n) {
        array = new String[n];
    }

    public void LeggInn(String s) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = s;
                return;
            }
        }
    }

    @Override
    public boolean hasNext() {
        if (this.i < this.array.length) {
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            String ret = array[this.i];
            this.i++;
            return ret;
        }
        return "error";
    }


}
