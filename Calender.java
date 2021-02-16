package sqw;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Sqw {
    public static void main(String[] args) {
      Calendar c= Calendar.getInstance();
      System.out.println(c.getTime());
      System.out.println(c.get(Calendar.DATE)); 
      System.out.println(c.get(Calendar.SECOND));
            System.out.println(c.get(Calendar.HOUR));

GregorianCalendar cal=new GregorianCalendar();
System.out.println(cal.isLeapYear(2820));
    }
    
}
