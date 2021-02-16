package arrc;

import java.util.Arrays;
import java.util.Scanner;

public class Arrc {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int[] n=new int[10];
        for(int i=0;i<n.length;i++){
            n[i]=s.nextInt();
        }
            System.out.println(Arrays.toString(n));
        int elt=6;
        int ind= linear(n,elt);
   System.out.println(ind);
    }
    private static int linear(int[] n,int elt){
        for(int i=0;i<n.length;i++){
            if(n[i]==elt){
                return i;
            }
        }
    return -1;
}
}
