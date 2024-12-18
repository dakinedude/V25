class DuplikatException extends Exception {
    public DuplikatException(String boktittel) {
        super(String.format("%s er allerede i samlingen", boktittel));
    }
}
