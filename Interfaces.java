package in;
interface A{
    public void as();
    public void s();
}
class Pw implements A{
    public void s(){
        System.out.println("hello");
    }
    public void as(){
        System.out.println("as fuck");
    }
}
public class In {
    public static void main(String[] args) {
       Pw p=new Pw();
       p.s();
       p.as();
    }
    
}
