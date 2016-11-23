/**
 * Created by cs.ucu.edu.ua on 23.11.2016.
 */
public class Data {
    private Integer inData;
    private Integer outData;
    public Data(Integer inData){
        this.inData = inData;
        this.outData = 1;
    }
    public synchronized void DoOutData(){
       // System.out.println(this.outData);
        this.outData = this.inData*2;
       // return this.outData;
    }
    public String toString(){
        return this.inData.toString()+ " "+ this.outData.toString();
    }
}
