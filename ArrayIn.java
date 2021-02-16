package bound;
import java.util.Scanner;
public class Bound {
    int arr[][]=new int[5][5];
    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter element in array:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
             arr[i][j]=sc.nextInt();
            }
        }}
    void display(){
        for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
                System.out.println(arr[i][j]);
    }}}
    public static void main(String[] args) {
        Bound b= new Bound();
        b.input();
        b.display();
    }
    
}
