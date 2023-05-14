package Bai6.CacDoiTuongHinhHoc;


public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println("Area Circle: "+circle.getArea());
        System.out.println("Perimeter Circle : "+circle.getPerimeter());
        System.out.println(circle+"\n");

        circle.setRadius(12);
        System.out.println("Area Circle: "+circle.getArea());
        System.out.println("Perimeter Circle : "+circle.getPerimeter());
        System.out.println(circle+"\n");

        Circle circle1=new Circle("red",false,3);
        System.out.println("Area Circle: "+circle1.getArea());
        System.out.println("Perimeter Circle : "+circle1.getPerimeter());
        System.out.println(circle1+"\n");

        Rectangle rectangle=new Rectangle();
        System.out.println("Area Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter Rectangle: " +rectangle.getPerimeter());
        System.out.println(rectangle+"\n");

        Rectangle rectangle1=new Rectangle(12,13);
        System.out.println("Area Rectangle: " + rectangle1.getArea());
        System.out.println("Perimeter Rectangle: " +rectangle1.getPerimeter());
        System.out.println(rectangle1+"\n");

        Rectangle rectangle2=new Rectangle("Red",true,34,89);
        System.out.println("Area Rectangle: " + rectangle2.getArea());
        System.out.println("Perimeter Rectangle: " +rectangle2.getPerimeter());
        System.out.println(rectangle2+"\n");

        Square square=new Square();
        System.out.println("Side Square: "+square.getSide());
        System.out.println("Area Square: "+square.getArea());
        System.out.println("Perimeter Square: "+square.getPerimeter());
        System.out.println(square+"\n");

        Square square1=new Square(12);
        System.out.println("Side Square: "+square1.getSide());
        System.out.println("Area Square: "+square1.getArea());
        System.out.println("Perimeter Square: "+square1.getPerimeter());
        System.out.println(square1+"\n");

        Square square2=new Square("yollow",false,6);
        System.out.println("Side Square: "+square2.getSide());
        System.out.println("Area Square: "+square2.getArea());
        System.out.println("Perimeter Square: "+square2.getPerimeter());
        System.out.println(square2+"\n");
    }
}
