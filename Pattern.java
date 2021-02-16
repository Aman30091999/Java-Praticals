package pattern;
public class Pattern {

    public static void main(String[] args) {
       int n=5,i=1;
       for(i=1;i<=n;i++){
           int j= n-i;
           while(j>0){
               System.out.println(" ");
               j--;
           }
           j=1;
           while(j<=1){
               System.out.println(" "+j);
               j++;
           }}
       int j=i-1;
       while(j>0){
          System.out.println(" "+j);
               j--;  
       }
       j=n-i;
       while(j>0){
            System.out.println(" ");
               j--;
       }
       System.out.println();
    }
    
}
