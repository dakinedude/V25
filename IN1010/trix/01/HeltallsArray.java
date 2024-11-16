public class HeltallsArray {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int e;
        
        a = 0;
        b = 1;
        c = 2;
        d = 3;
        e = 4;

        System.out.println(a+b+c+d+e);

        int[] array = new int[5];

        int lengde = array.length;
        int cnt = 0;

        while (cnt < 5) {
            
            array[cnt] = cnt;
            cnt ++;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
