package Bai6.CacDoiTuongHinhHoc;

public class Square extends Rectangle {
    public Square() {
        super.setWidth(1);
        super.setHeight(1);
    }

    public Square(double size) {
        super.setWidth(size);
        super.setHeight(size);
    }

    public Square(String color, boolean filled, double size) {

        super(color, filled, size, size);
    }

    public double getSide() {
        return getHeight();
    }

    @Override
    public String toString () {
        return "Square " +
                "size=" + getSide() + ", which is a subclass of " + super.toString();
    }
}