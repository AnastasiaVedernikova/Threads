import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by cs.ucu.edu.ua on 23.11.2016.
 */
public class PoolData {
    private Queue<Data> myQueue;
    public PoolData(){//BlockingQueue
        this.myQueue = new LinkedList<Data>();
        for (int i=0;i<100;i++){
            this.myQueue.add(new Data(i));
        }
    }
    public String toString(){
        String AM = "";
        if (!this.myQueue.isEmpty()) {
            for (Data el : this.myQueue) {
                AM += el.toString() + "\n";
            }
        }
        return AM;
    }
    public synchronized Data remove(){
        Data el = this.myQueue.peek();
        this.myQueue.remove(el);
      //  System.out.println(this.myQueue);
        return el;
    }
    public Integer size(){
        return this.myQueue.size();
    }

    public boolean isEmpty(){
        return this.myQueue.isEmpty();
    }
}
