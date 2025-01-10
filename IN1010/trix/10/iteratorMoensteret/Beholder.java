import java.util.Iterator;

class Beholder implements Iterable<String> {

    node start;
    node slutt;

    private class node {
        String data;
        node neste;
        node forrige;

        public node(String data) {
            this.data = data;
        }
    }

    public void add(String data) {
        node ny = new node(data);
        if (start == null) {
            this.start = ny;
            this.slutt = ny;
        } else {
            slutt.neste = ny;
            ny.forrige = slutt;
            this.slutt = ny;
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<String> {
        private node denne = slutt;

        @Override
        public boolean hasNext() {
            return denne != null;
        }

        @Override
        public String next() {
            String data = denne.data;
            denne = denne.forrige;
            return data;
        }
    }
    
}
