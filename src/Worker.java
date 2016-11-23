/**
 * Created by cs.ucu.edu.ua on 23.11.2016.
 */
public class Worker implements  Runnable {
    private PoolData poolData;
    private NewPoolData newPoolData;
    public Worker(PoolData poolData, NewPoolData newPoolData){
        this.poolData = poolData;
        this.newPoolData = newPoolData;
    }
    public void run(){
        while (!this.poolData.isEmpty()){
            Data el = this.poolData.remove();
          //  System.out.println("---------------------------------------"+Thread.currentThread().getName());
            el.DoOutData();
            this.newPoolData.add(el);
        }
        System.out.println(this.newPoolData.toString());
       // System.out.println("Done"+Thread.currentThread().getName());
        System.out.println("---------------------------------------"+Thread.currentThread().getName());
    }

}
