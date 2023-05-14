package Bai7.TrienKhaiInterfaceColorableChoCacLopHinhHoc;

import Bai6.CacDoiTuongHinhHoc.Circle;
import Bai6.CacDoiTuongHinhHoc.Rectangle;
import Bai6.CacDoiTuongHinhHoc.Shape;
import Bai6.CacDoiTuongHinhHoc.Square;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {new Circle(12),
                new Rectangle(12, 15),
                new Square(4)};
        for (Shape s : shapes) {
            System.out.println(s);
            s.howtoColor("đen");
        }
    }

}
