package dae;
public class Daemon extends Thread{
public Daemon(String n){
    super(n);
}
public void run(){
    if(Thread.currentThread().isDaemon()){
        System.out.println(getName() +"is daemon");
    }
    else{
    System.out.println(getName() + "is user thread");
}
    System.out.println(getName() +"priority" +Thread.currentThread().getPriority());
}
    public static void main(String[] args) {
        Daemon d1=new Daemon("D1");
        Daemon d2=new Daemon("D2");
        Daemon d3=new Daemon("D3");
        d1.setDaemon(true);
        d1.start();
        d2.start();
        d3.start();
        d3.setDaemon(true);

    }
    
}
