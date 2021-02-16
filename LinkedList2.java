package sa;
import java.util.*;
public class Sa {
    public static void main(String[] args) {  
    LinkedList t=new LinkedList();
    t.add("aman");
    t.add("gupta");
    t.add("ji");
    t.add("AKUM");
    System.out.println(t);
    ListIterator it=t.listIterator();
    while(it.hasNext()){
   String I=(String)it.next();
   if(I.equals("ji"))
       it.set("op");
   else if(I.equals("C"))
       it.add("DS");
   else if(I.equals("PHP"))
       it.remove();}
        System.out.println(t);   
}}
