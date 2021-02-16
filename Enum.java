package o;
public class O{
enum Level{
    Low,MEDIUM,HIGH
}
    public static void main(String[] args) {
       Level l=Level.MEDIUM;
       switch(l){
           case Low:     
       System.out.print("Low level");
       break;
        case MEDIUM:     
       System.out.print("MEDIUM level");
       break;
        case HIGH:     
       System.out.print("HIGH level");
       break;
    }}
    
}
