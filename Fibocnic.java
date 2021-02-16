/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiboc;
public class Fibocnic {
static int a=0,b=1,c;
    public static void main(String[] args) {
      System.out.println(a+" "+b);
      Fibocnic f= new Fibocnic();
      f.Fib(12);
  }   
  public void Fib(int i){
      if(i>=1){
          c=a+b;
          System.out.println(c);
          a=b;
          b=c;
          Fib(i-1);
      }
  }
} 
