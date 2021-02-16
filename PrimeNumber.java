package prime;
public class PrimeNumer {
static void checkP(int n){
    int i,m=0,f=0;
    m=n/2;
    if(n==0||n==1){
        System.out.println(n+"is not prie number");
    }
    else{
        for(i=2;i<=m;i++){
            if(n%i==0){
                System.out.println(n+"is not prime number");
                f=1;
                break;
            }
        }
    }
    if(f==0){
        System.out.println(n+"is prime number");
    }
}
    public static void main(String[] args) {
        // TODO code application logic here
        checkP(4);
        checkP(6);
        checkP(5);
    }
    
}
