package Bai6.LopCircleVaCylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle+"\n");

        Circle circle1=new Circle(12.3,"jsdh",false);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1+"\n");

        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder.getAreaTotal());
        System.out.println(cylinder.getAreaSurrounding());
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder+"\n");

        Cylinder cylinder1=new Cylinder(23);
        System.out.println(cylinder1.getAreaTotal());
        System.out.println(cylinder1.getAreaSurrounding());
        System.out.println(cylinder1.getVolume());
        System.out.println(cylinder1+"\n");

        Cylinder cylinder2=new Cylinder(45.6,"green",false,23);
        System.out.println(cylinder2.getAreaTotal());
        System.out.println(cylinder2.getAreaSurrounding());
        System.out.println(cylinder2.getVolume());
        System.out.println(cylinder2);
    }
}
