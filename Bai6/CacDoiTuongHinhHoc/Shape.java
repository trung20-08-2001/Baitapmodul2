package Bai6.CacDoiTuongHinhHoc;

import Bai7.TrienKhaiInterfaceColorableChoCacLopHinhHoc.Colorable;
import Bai7.TrienKhaiInterfaceResizeableChoCacLopHinhHoc.Resizeable;

public abstract class Shape implements Comparable<Shape>, Resizeable, Colorable {
    private String color = "Black";
    private boolean filled = true;

    Shape() {
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
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

    public String toString() {
        return "Shape: " + "color=" + color + ((filled) ? " filled" : " not filled");
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void resize(double a);

    public abstract int compareTo(Shape obj);

    public abstract void howtoColor(String color);


}
