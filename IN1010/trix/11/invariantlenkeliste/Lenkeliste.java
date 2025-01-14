class Lenkeliste {
    Node hode;

    void settInn(String data, int prioritet) {
        Node nyNode = new Node(data, prioritet);

        if (this.hode == null || nyNode.prioritet <= this.hode.prioritet) {
            nyNode.neste = this.hode;
            this.hode = nyNode;
        } else {
            Node gjeldende = this.hode;
            while (gjeldende.neste != null && gjeldende.neste.prioritet <= nyNode.prioritet) {
                gjeldende = gjeldende.neste;
            }
            nyNode.neste = gjeldende.neste;
            gjeldende.neste = nyNode;
        }
    }
}

// invarianten holder ikke, for prioriteringen er ikke
// riktig implimentert. Bytt ut > med <.
