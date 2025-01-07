class Dobbellenke<T> {
    Node start = null;

    class Node {
        T data;
        Node neste;
        Node forrige;

        Node(T d, Node n, Node f) {
            this.data = d;
            this.neste = n;
            this.forrige = f;
        }
    }

    public void SettInn(T data) {
        Node ny = new Node(data, null, null);
        if (this.start == null) {
            this.start = ny;
            return;
        }
        Node tmp = this.start;
        while (tmp.neste != null) {
            tmp = tmp.neste;
        }
        tmp.neste = ny;
        ny.forrige = tmp;
    }

    public T Fjern(int i) {
        int cnt = 0;
        Node tmp = this.start;
        while (cnt != i) {
            tmp = tmp.neste;
            cnt++;
        }
        if (tmp == null) {
            return null;
        }
        Node ret = tmp;

        Node prev = tmp.forrige;
        Node next = tmp.neste;

        if (prev != null) {
            prev.neste = next;
        } else {
            this.start = next;
        }

        if (next != null) {
            next.forrige = prev;
        }
        return ret.data;
    }

    public int Lengde() {
        if (this.start == null) {
            return 0;
        }
        int cnt = 0;
        Node tmp = this.start;
        while (tmp != null) {
            tmp = tmp.neste;
            cnt++;
        }
        return cnt;
    }
}
