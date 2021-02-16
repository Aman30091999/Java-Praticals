package se;
import java.util.Scanner;
public class Se {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,fact=1,n;
        double sum=0.0;
        System.out.println("enter input");
        n=s.nextInt();
        for(i=1;i<=n;i++){
            fact*=i;
            sum+=fact/i;   
        }
        System.out.println("the sum of series:"+sum);
    }
    
}
