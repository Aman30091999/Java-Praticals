package mirror;
import java.util.*;
public class Mirror {
    public static void main(String[] args) {
        int r,c;
        Scanner s= new Scanner(System.in);
        System.out.print("enter rows");
        r=s.nextInt();
        System.out.print("enter rows");
        c=s.nextInt();
        int m[][]=new int[r][c];
        System.out.print("enter matrix:");
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               m[i][j]=s.nextInt();
           }
       }
       System.out.println("mirrir matrix");
         for(int i=0;i<r;i++){
           for(int j=c-1;j>=0;j--){
               System.out.println(m[i][j]);
           }
           System.out.println();
       }
        
    }
    
}
