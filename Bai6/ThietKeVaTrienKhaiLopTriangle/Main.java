package Bai6.ThietKeVaTrienKhaiLopTriangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        System.out.println(triangle);
        triangle.setSide2(20f);
        triangle.setSide1(12f);
        triangle.setSide3(12.0f);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle);
    }
}
