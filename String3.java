package j;
import java.util.*;
public class J{
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String st;
       System.out.println("enter string:");
       st=s.nextLine();
       int i=0;
       int a[]=new int[256];
       for(i=0;i<st.length();i++){
           if(st.charAt(i)!=' ')
           a[st.charAt(i)]++;
       }
       char c=' ';
       System.out.println("all non repeated:");
       for(i=0;i<st.length();i++){
           if(a[st.charAt(i)]==1){
               c=st.charAt(i);
               System.out.println(c+" ");
           }
       }
       s.close();
    }
}
