package pass;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Password {
    private static final String PASSWORD_REGEX="^(?=.*[0-9])"+
            "(?=.*[a-z])(?=.*[A-Z])"+
            "(?=.*[@#$%^&+=])"+
            "(?=\\S+$).{6,12}$";
    private static boolean isPasswordValid(String passwrod){
        if(passwrod==null) return false;
       Pattern pattern =Pattern.compile(PASSWORD_REGEX);
       return pattern.matcher(passwrod).matches();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter password");
        String passWord=s.next();
        if(isPasswordValid(passWord)){
            System.out.println("Its valid password");
        }
        else{
            System.out.println("not valid");
        }
    }
    
}
