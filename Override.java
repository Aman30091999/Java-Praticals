package boy;
public class Boy {
    int id;
    String name;
    Boy(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
    Boy b=new Boy(56,"aman");
    b.display();
    }
    
}
