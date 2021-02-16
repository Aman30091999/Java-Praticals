package No;
public class No extends Thread{
public void run(){
    for(int i=1;i<5;i++){
      try{
       Thread.sleep(500);}
    catch(InterruptedException e){
          System.out.println(e);
             }
      System.out.println(i);
         }
     }
    public static void main(String args[]) {
     No m= new No();
      m.start();
    }
}
