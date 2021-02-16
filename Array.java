package array;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
         int a[][]=new int[3][3];
         int b[][]= new int[3][3];
         int c[][]=new int[3][3];
        Scanner s= new Scanner(System.in);
        System.out.println("enter character:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
        a[i][j]= s.nextInt();}}
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
         b[i][j]= s.nextInt();
    }}
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
         c[i][j] += a[i][k]*b[k][j];
    }}}
    
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
         System.out.print(c[i][j]);
    }}
    
    }
}
