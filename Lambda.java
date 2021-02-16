package me;
public class Me {
    public <E>void p(E []s){
        for(E x : s)//lambda function
        {
            System.out.println(x);
        }
    }
   
    public static void main(String[] args) {
       Me m=new Me();
       String c[]=new String[]{"aman","hui"};
       Integer i[]=new Integer[]{3,4,5,6};
       m.p(c);
       m.p(i);
    }
    
}
