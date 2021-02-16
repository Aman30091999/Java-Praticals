package multip;
class Book{
    int total=10;
    synchronized void Book(int seats){
        if(total>=seats){
            System.out.println(seats+"total booked securely ");
            total -=seats;
            System.out.println("seats left:" + total);
        }
        else{
            System.out.println("Sorry");
                        System.out.println("seats: "+total);
        }
    } 
}
public class Multip extends Thread {
    static Book b;
    int seats;
    public void run(){
        b.Book(seats);
    }
    public static void main(String[] args) {
       b=new Book();
      
       Multip deepak=new Multip();
       deepak.seats=7;
       deepak.start();
     Multip deepak1=new Multip();
       deepak1.seats=7;
       deepak1.start();
    
    
}}
