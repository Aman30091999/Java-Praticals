package capacity;
public class Capacity {
    static void validate(int age){
    if(age<18)
           throw new ArithmeticException ("valid");
           else
                   System.out.println("welcome to vote");
                   }
      public static void main(String[] args) {
         validate(21);
           System.out.println("common task complete");
       }}
    

