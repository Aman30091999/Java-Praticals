package re;
import java.util.Arrays;
class E{
    int em;
    String n;
    E(int em,String n){
     this.em=em;
     this.n=n;   
    }
    void show(){
        System.out.println(em);        
        System.out.println(n);
    }
}
public class Re {
    public static void main(String[] args)throws ClassNotFoundException {
       Class n=Class.forName("re.E");
       System.out.print(n.getName());
      System.out.print(n.getTypeName());
       Arrays.stream(n.getDeclaredConstructors()).forEach(System.out::println);
            Arrays.stream(n.getDeclaredFields()).forEach(System.out::println); 
            Arrays.stream(n.getDeclaredMethods()).forEach(System.out::println);
    }
    
}
