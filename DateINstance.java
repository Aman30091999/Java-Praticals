package da;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class DateINstance {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d.toString());
        Locale locItalian=new Locale("it");
       DateFormat s=DateFormat.getDateInstance(DateFormat.FULL,locItalian);
        System.out.println(s.format(d));
    }
    
}
