package gf;
import java.io.*;
public class Gf {
static int swapBits(int n,int p1,int p2){
    int b1=(n>>p1)&1;
    int b2=(n>>p2)&1;
    int x= (b1^b2);
    x=(x<<p1)|(x<<p2);
    int result=n^x;
    return result;
}
    public static void main(String[] args) {
        // TODO code application logic here
    int n=swapBits(28,0,3);
    System.out.println(n);
    }
    
}
