package Bai7.TrienKhaiInterfaceResizeableChoCacLopHinhHoc;

import Bai6.CacDoiTuongHinhHoc.Circle;
import Bai6.CacDoiTuongHinhHoc.Rectangle;
import Bai6.CacDoiTuongHinhHoc.Square;
import Bai6.CacDoiTuongHinhHoc.Shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes={new Circle(12),
                new Rectangle(12,13),
                new Square(5)};
        System.out.println("Trước khi thay đổi");
        for(Shape s:shapes){
            System.out.println(s);
        }
        System.out.println("Sau khi thay đổi");
        for(Shape s:shapes){
            s.resize(1.3);
            System.out.println(s);
        }

    }
}
