package Bai6.ThietKeVaTrienKhaiLopTriangle;
public class Triangle extends Shape {
    private double side1=1;
    private double side2=1;
    private double side3=1;
    public  Triangle(){
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public String getPerimeter(){
        return "Perimeter Triangle: "+(this.side1+this.side2+this.side3);
    }
    public String getArea(){
        double halfCircumference=(this.side1+this.side2+this.side3)/2;
        return "Area Triangle: "+Math.sqrt(halfCircumference*(halfCircumference-this.side1)*(halfCircumference-this.side2)*(halfCircumference-this.side3));
    }
    public String toString(){
        return "Triangle with side1:"+this.side3+", side2:"+this.side2+", side3:"+this.side3+" which is a subclass of "+super.toString();
    }
}
