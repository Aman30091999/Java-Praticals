package cv;
public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int c=5/0;
        }
        catch(ArithmeticException e){
            System.out.print("arithmethic exception");
        }
        catch(Exception a){
            System.out.println("Exception ");
        }
        System.out.println("last line");
    }
    
}
