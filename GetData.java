package sol;
public class Sol {
public static void main(String[] args){
    try{
        getdata();
        getdata1();
    }
    catch(NullPointerException ex){
       System.out.println("handli in main method"); 
    }
    }
static void getdata(){
    try{
        float a=100/3;
        System.out.println("A:"+a);
    }
    catch(ArithmeticException e){
        throw new NullPointerException();
    }
}
static void getdata1(){
    try{
        int a=100/0;
        System.out.println("A:"+a);
    }
    catch(ArithmeticException e){
        throw new NullPointerException();
    }
}}
