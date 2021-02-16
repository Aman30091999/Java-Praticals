package tree;
import java.util.*;
public class Tree {
    public static void main(String[] args) {
        Map<String,String> t=new HashMap();
        t.put("aman","gupta");
        t.put("A","B");
        Set<String> keys=t.keySet();
        for(String key :keys){
        System.out.println(key +" "+t.get(key));
    }}
    
}
