package javaapplication59;
class Circle{
public double x,y,r;
public Circle(double X,double Y,double redius){
    x=X;
    y=Y;
    r=redius;
}
public Circle(double redius){
    x=0;y=0;r=redius;
}
public Circle(){
    x=0;y=0;r=1.0;
}
public double cir(){
    return 2*3.14*r;
}
public double area(){
    return 3.14*r*r;
}}
public class JavaApplication59{
    
    public static void main(String[] args) {
   Circle c= new Circle(10.0,12.0,20.0);
   Circle c1=new Circle(10.0);
   Circle c2=new Circle();
   
        }
}
