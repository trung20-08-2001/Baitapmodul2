package Bai6.CacDoiTuongHinhHoc;


public class Circle extends Shape {
    private double radius = 1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    public String toString() {
        return "A Circle with radius " + this.radius + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double a) {
        radius *= a;
    }

    @Override
    public int compareTo(Shape obj) {
        if (this.getArea() > obj.getArea()) {
            return 1;
        } else if (this.getArea() < obj.getArea()) {
            return -1;
        } else return 0;
    }

    @Override
    public void howtoColor(String color) {
        System.out.println("Đã tô màu " + color + " cho hình.");
    }

}
