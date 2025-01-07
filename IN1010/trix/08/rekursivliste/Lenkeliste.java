public class Lenkeliste<T> {
    Node start = null;
    
    private class Node {
        T data;
        Node neste;

        Node(T d, Node n) {
            this.data = d;
            this.neste = n;
        }
    }

    public void SettInn(T data) {
        Node ny = new Node(data, null);
        if (this.start == null) {
            this.start = ny;
            return;
        }

        hjelpSettInn(this.start, ny);
    }

    private void hjelpSettInn(Node n, Node ny) {
        if (n.neste != null) {
            hjelpSettInn(n.neste, ny);
        } else {
            n.neste = ny;
        }
    }

    public int Lengde() {
        if (this.start == null) {
            return 0;
        }

        return hjelpLengde(this.start);

    }

    private int hjelpLengde(Node n) {
        int tot = 1;
        if (n.neste != null) {
            tot += hjelpLengde(n.neste);
        }
        return tot;
    }

    public T Hent(int pos) {
        if (this.start == null) {
            return null;
        } else if (pos == 0) {
            return this.start.data;
        } else {
            return hent(pos, 1, this.start.neste);
        }
    }

    private T hent(int pos, int i, Node n) {
        if (n == null) {
            return null;
        }

        if (i == pos) {
            return n.data;
        }

        return hent(pos, i + 1, n.neste);
    }
}
