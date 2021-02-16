package power;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n,i,p=1;
       System.out.println("enter number(Limit):");
       n=s.nextInt();
       for(i=0;i<=n;i++){
           if(i%2==0){
               System.out.println(-1*p+" ");
           }
           else{
               System.out.print(p+" ");
           }
           p=(int)(p+Math.pow(i,2));
       }
       s.close();
    }
    
}
