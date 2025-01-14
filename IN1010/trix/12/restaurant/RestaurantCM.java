import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RestaurantCM {
    public static void main(String[] args) {
        int antallPlassbord = Integer.parseInt(args[0]);
        int antallRetter = Integer.parseInt(args[1]);
        FellesBord bord = new FellesBord(antallPlassBord);
        Kokk kokk = new Kokk(bord, antallRetter);
        new Thread(kokk).start();
        Servitor servitor = new Servitor(bord, antallRetter)
    }
}
