public class Skattejakt {

    boolean funnet = false;
    
    private Skattejakt(char[] chars, int hoyde, int bredde) {

    }

    public static getSkattejakt(int hoyde, int bredde) {
        if (instance == null) {
            instance = new Skattejakt(hoyde, bredde);
        }

        return instance;
    }
