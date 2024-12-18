class Kvadratstabel {
    Node start;

    class Node {
        Kvadrat data;
        Node neste;

        public Node(Kvadrat data, Node neste) {
            this.data = data;
            this.neste = neste;
        }
    }

    public void leggPaa(Kvadrat k) {
        Node ny = new Node(k, null);
        if (this.start == null) {
            this.start = ny;
            return;
        }
        Node tmp = this.start;
        ny.neste = tmp;
        this.start = ny;
    }

    public Kvadrat taAv() {
        Node ret = this.start;
        if (ret == null) {
            return null;
        }
        this.start = this.start.neste;
        return ret.data;
    }

    public boolean erTom() {
        return this.start == null;
    }
}
