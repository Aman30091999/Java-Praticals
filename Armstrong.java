package armstrong;
public class Armstrong {
    public static void main(String[] args) {
        // TODO code application logic here
        int n=113;
        int t=n;
        int len=0;
        while(t != 0){
            len=len+1;
            t=t/10;
        }
        int t2=n;
        int arm=0,rem;
        while(t2!=0){
            int mul=1;
            rem=t2%10;
            for(int i=1;i<=len;i++){
                mul=mul*rem;
            }
            arm=arm+mul;
            t2=t2/10;
            
        }
        if(arm==n){
            System.out.println(n+"is arm strong no ");
        }
        else{
            System.out.println(n+"is not armstrong");
        }
    }
    
}
