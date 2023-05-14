package Bai6.LopCircleVaCylinder;

public class Circle {
    private double radius=1;
    private String color="Black";
    private boolean filled=true;
    public Circle(){
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String getArea(){
        return "Area Circle: "+this.radius*this.radius*Math.PI;
    }
    public String getPerimeter(){
        return "Perimeter Circle: "+2*Math.PI*this.radius;
    }
    public String toString(){
        return "Circle with radius "+this.radius+", color: "+((filled)?"filled":"not filled");
    }
}
