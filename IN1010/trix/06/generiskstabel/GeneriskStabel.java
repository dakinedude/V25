class GeneriskStabel<T> {
    Node start;

    class Node {
        T data;
        Node neste;

        public Node(T data, Node neste) {
            this.data = data;
            this.neste = neste;
        }
    }

    public void leggPaa(T t) {
        Node ny = new Node(t, null);
        if (this.start == null) {
            this.start = ny;
            return;
        }
        Node tmp = this.start;
        ny.neste = tmp;
        this.start = ny;
    }

    public T taAv() {
        if (this.start == null) {
            return null;
        }
        Node ret = this.start;
        this.start = this.start.neste;
        return ret.data;
    }

    public boolean erTom() {
        return this.start == null;
    }
}
