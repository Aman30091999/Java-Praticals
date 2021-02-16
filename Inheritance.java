package parent;
public class Test {
    public static void main(String[] args) {
        // TODO code application logic here
    Child c=new Child();
    c.p1();
    c.c1();
    Sub s= new Sub();
    s.p1();
    s.s1();
    }
}

package parent;
public class Sub extends Parent{
     public void s1(){
        System.out.println("sub class");
    }   
}

package parent;
public class Child extends Parent{
    public void c1(){
        System.out.println("child class");
    }
     
}
package parent;
public class Parent {

    public void p1(){
        System.out.println("parent class");
    }
   
}
