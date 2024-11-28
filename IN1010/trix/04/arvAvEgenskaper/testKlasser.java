class testKlasser {
    public static void main(String[] args) {

        classB obj = new classB();
        classB peker1 = obj;
        classA peker2 = (classA) obj;

        peker1.skrivKlasse();
        peker2.skrivKlasse();

        // a) begge skriver `klasse B`
        // b) compilation error
        // c) begge skriver `klassse A`
    }
}
