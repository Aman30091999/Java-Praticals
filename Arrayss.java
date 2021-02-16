package ar;
import java.util.*;
public class Arrayss {
public static void main(String[] args) {
       int a[]=new int[10];
       int i;
       Arrays.fill(a,5);
       for(i=1;i<a.length;i++)
        System.out.println(a[i]+" ");
       Arrays.fill(a, 6,7,8);
        for(i=0;i<a.length;i++)
            System.out.println(a[i]+" ");
    }
    
}
