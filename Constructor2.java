package c;
public class C {
public void myMethod(){
    System.out.println("method");
}
{
    System.out.println("instance block");
}
public void C(){
    System.out.println("constructor");
}
static{
    System.out.println("static block");
}
    public static void main(String[] args) {
        C c= new C();
        c.C();
        c.myMethod();
    }
    
}
