package as;
abstract class B {
    abstract void callme();}
class As extends B{
    void callme(){
        System.out.println("Calling....");
    }
    public static void main(String[] args) {
        As a=new As();
        a.callme();
    }
    
}
