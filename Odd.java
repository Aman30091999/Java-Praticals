package odd;
import java.util.*;
public class Odd {
  public void interest(int n ){
      int[] b= new int[10000];
      int i=0;
      while(n>0){
          b[i]=n%2;
          n=n/2;
          i++;
      }
      for(int j=i-1;j>=0;j--){
          System.out.print(b[j]);
      }
      
  }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner(System.in);
        System.out.println("enter a:");
        int n= s.nextInt();
        Odd o= new Odd();
        o.interest(n);
       
    }
    
}
