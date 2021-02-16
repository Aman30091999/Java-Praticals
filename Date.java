package d;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class Date {
    public static void main(String[] args) {
        LocalDateTime l= LocalDateTime.now();
        System.out.print(l);
        DateTimeFormatter m=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String f=l.format(m);
        System.out.print(f);
    }
    
}
