package exc;
public class Exc extends Thread {
    public void run(){
       // System.out.println(Thread.currentThread().isInterrupted());
        try{
            for(int i=1;i<=5;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println("thread interrupted" +e);
        }
    }
    public static void main(String[] args) {
     Exc e=new Exc();
     e.start();
     e.interrupt();
    }
}