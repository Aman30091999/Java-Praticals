package awq;
import java.util.*;
public class Awq {
    public static void main(String[] args) {
        String a="AMANGR";
        String b=a.toLowerCase();
        b.replace('a','o');
        b.replace('m', 't');
        System.out.print(b);
        System.out.print(b.replace('o','a'));
        
    }
    
}
