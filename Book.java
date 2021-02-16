package book;
import java.util.*;
class Ex {
    private String title;
    private double price;
    public Ex(String title,double price){
        this.title=title;
        this.price=price;
    }
    public String getTitle(){
        return (title);
    }
    public double getPrice(){
        return (price);
    }}
class My implements Comparator{
    public int compare(Object o1,Object o2){
     Ex e1=(Ex)o1; 
      Ex e2=(Ex)o2; 
       if(e1.getPrice()<e2.getPrice()){
           return (-1);
       }
       else
           return 1;
    }
}
public class Book{
    public static void main(String[] args) {
      Ex e1,e2,e3;
      e1=new Ex("aman",300.98); 
       e2=new Ex("rana",304.98); 
        e3=new Ex("amanji",300.68); 
        TreeSet t=new TreeSet(new My());
        t.add(e1);
        t.add(e2);
        t.add(e3);
        Ex e;
        Iterator it=t.iterator();
        while(it.hasNext()){
           e= (Ex)it.next();
            System.out.println(e.getTitle()+" "+e.getPrice());
        }
    }
    
}
