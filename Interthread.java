package interthread;
class Total extends Thread{
    int totals;
    public void run(){
        synchronized(this){
        for(int i=1;i<=10;i++){
            totals=totals+100;
        }  this.notify();
        
    }
}}
public class Interthread {
    public static void main(String[] args)throws InterruptedException {
        Total to=new Total();
        to.start();
       // System.out.println(to.totals);
        synchronized(to){
        to.wait();
        System.out.println("total earning :"+to.totals);
    }
    }
    
}
