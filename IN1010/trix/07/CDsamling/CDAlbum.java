public class CDAlbum implements Comparable<CDAlbum> {
    String artistnavn;
    String albumnavn;
    String utgivelsesaar;

    public CDAlbum(String artistnavn, String albumnavn, String utgivelsesaar) {
        this.artistnavn = artistnavn;
        this.albumnavn = albumnavn;
        this.utgivelsesaar = utgivelsesaar;
    }

    @Override
    public String toString() {
        return String.format("Artistnavn: %s, Albumnavn: %S, Utgitt: %s", this.artistnavn, this.albumnavn, this.utgivelsesaar);
    }

    public String hentArtistnavn() {
        return this.artistnavn;
    }

    @Override
    public int compareTo(CDAlbum other) {
        int terskel;
        String thisNavn = this.hentArtistnavn();
        String otherNavn = other.hentArtistnavn();

        if (thisNavn.equals(otherNavn)) {
            return 0;
        }

        if (thisNavn.length() < otherNavn.length()) {
            terskel = thisNavn.length();
        } else {
            terskel = otherNavn.length();
        }

        for (int i = 0; i < terskel; i++) {
            if (thisNavn.charAt(i) < otherNavn.charAt(i)) {
                return -1;
            } else if (thisNavn.charAt(i) > otherNavn.charAt(i)) {
                return 1;
            }
        }
        return 0;
    }
}
