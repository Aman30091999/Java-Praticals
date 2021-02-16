package gen;
class My < T>{
    T i;
    public void add(T i1){
        i=i1;
    }
    public T get(){
        return (i);
    }
}
public class Gen {
    public static void main(String[] args) {
        My<Integer> m=new My<Integer>();
         My<String> m2=new My<String>();
         Integer k=new Integer(5);
         m.add(k);
         m2.add("Aman");
         System.out.print("m="+m.get() + "m2="+ m2.get());
    }
    
}
