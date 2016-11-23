import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by cs.ucu.edu.ua on 23.11.2016.
 */
public class Main {
    public static void main (String[] args){
        PoolData poolData = new PoolData();
        NewPoolData newPoolData = new NewPoolData();
        Worker first = new Worker(poolData, newPoolData);
        Worker second = new Worker(poolData, newPoolData);
        Worker third = new Worker(poolData, newPoolData);
        Thread t1 = new Thread(first);
        Thread t2 = new Thread(second);
        Thread t3 = new Thread(third);
        t1.start();
        t2.start();
        t3.start();


    }
}
