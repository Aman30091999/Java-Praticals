ackage person;
public class Person {
    void msg(){
        System.out.println("welcome");
    }
   
    
}

package person;
public class Stud extends Person{
   void msg(){
       System.out.println("welcome to java");
   } 
   void dis(){
       msg();
       super.msg();
   }
   public static void main(String args[]){
       Stud s= new Stud();
       s.dis();
   }
}
