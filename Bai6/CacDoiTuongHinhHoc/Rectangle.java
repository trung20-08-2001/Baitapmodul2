package Bai6.CacDoiTuongHinhHoc;

public class Rectangle extends Shape{
    private double width=1;
    private double height=2;
    public  Rectangle(){
    }
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.height*this.height;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle " +
                "width=" + width +
                ", height=" + height+", which is a subclass of " +super.toString();
    }
    @Override
    public void resize(double a){
        height*=a;
        width*=a;
    }
    @Override
    public int compareTo(Shape obj){
        if (this.getArea() > obj.getArea()) {
            return 1;
        } else if (this.getArea() < obj.getArea()) {
            return -1;
        } else return 0;
    }
    @Override
    public void howtoColor(String color){
        System.out.println("Đã tô màu "+color+" cho hình.");
    }

}
