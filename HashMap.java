package lista;
import  java.util.*;
public class List {
    public static void main(String[] args) {
       HashMap<Integer,String> a=new HashMap<Integer,String>();
       a.put(1,"tops");
       a.put(2,"aman");
       a.put(3,"ak");
      for(Map.Entry m:a.entrySet()){
         System.out.println(m.getKey()+" "+m.getValue());
    }}
    
}

package lista;
import  java.util.*;
public class Lista {
    public static void main(String[] args) {
       ArrayList<String> a=new ArrayList<String>();
       a.add("tops");
       a.add("aman");
       a.add(1,"ak");
       System.out.println("Array list:");
       System.out.print(a.get(1));
       ListIterator<String> itr=a.listIterator();
     System.out.println("travers element forward");
     while(itr.hasNext()){
         System.out.println(itr.next());
     }
       System.out.println("Linked list backward...");
       while(itr.hasPrevious()){
       System.out.println(itr.hasPrevious());
    }}
    
}
