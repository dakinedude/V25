class IkkeMerPlassException extends Exception {
    public IkkeMerPlassException(String boktittel) {
        super(String.format("Ikke mer plass for %s", boktittel));
    }
}
