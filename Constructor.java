package amangupta;
public class Amangupta {
    
  public void eat(){
      System.out.println("human eating");
    }
}

import amangupta.Amangupta;
    class Boy extends Amangupta{
    public void eat(){
        System.out.println("boy is aeting");
    }
     public static void main(String args[]){
        Boy b= new Boy();
        b.eat();
     }
    }


