package que;
import java.util.LinkedList;
import java.util.Queue;
public class Que {
    public static void main(String[] args) {
        Queue<Integer> a=new LinkedList<>();
        for(int i=0;i<10;i++)
        a.add(i);
        System.out.println(a);
        int b=a.remove();
        System.out.println(b);
        System.out.println(a);
        int c=a.peek();
        System.out.println(c);
        System.out.println(a);
        int d=a.size();
        System.out.println(d);      
        }
    }
    
