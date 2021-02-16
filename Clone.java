package b;
public class B implements Cloneable {
    int roll;
    String name;
    B(int roll ,String name){
        this.roll=roll;
        this.name=name;
    }
    public Object Clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args) {
        try{
            B b=new B(1,"aman");
            B b1=(B)b.clone();
System.out.println(b.roll+" "+b.name);
System.out.println(b1.roll+" "+b1.name);
        }
        catch(CloneNotSupportedException c){
        }
    }
    
}
