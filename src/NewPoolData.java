import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by cs.ucu.edu.ua on 23.11.2016.
 */
public class NewPoolData {
    private Queue<Data> newQueue;
    public NewPoolData(){//BlockingQueue
        this.newQueue = new LinkedList<Data>();
    }
    public String toString(){
        String AM = "";
        if (!this.newQueue.isEmpty()) {
            for (Data el : this.newQueue) {
                AM += el.toString() + "\n";
            }
        }
        return AM;
    }
    public synchronized void add(Data ob){
        //System.out.println(this.toString());
        this.newQueue.add(ob);
    }
    public Integer size(){
        return this.newQueue.size();
    }

}
