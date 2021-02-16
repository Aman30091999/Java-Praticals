package g;
public class G {
    G g2;
    public static void main(String[] args) {
       G g=new G();
       G g1=new G();
       g.g2=g1;
       g1.g2=g;
       g=null;
       g1=null;
       Runtime.getRuntime().gc();
       System.out.println("main method is done");
    }
    protected void finalize() throws Throwable{
        System.out.println("Finalize");
    }
}
