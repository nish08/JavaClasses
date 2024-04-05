package Polymorphism;
class Shape{
    void draw(){
        System.out.println("drawing..");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Shape is rectangle...");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Shape is square...");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Shape is triangle");
    }
}
public class ShapePoly {
    public static void main(String[] args) {
        Shape s;
         s = new Rectangle();
         s.draw();

         s=new Triangle();
         s.draw();

         s=new Square();
         s.draw();
    }
}
