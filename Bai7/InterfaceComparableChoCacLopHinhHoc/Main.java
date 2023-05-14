package Bai7.InterfaceComparableChoCacLopHinhHoc;

import Bai6.CacDoiTuongHinhHoc.Circle;
import Bai6.CacDoiTuongHinhHoc.Rectangle;
import Bai6.CacDoiTuongHinhHoc.Shape;
import Bai6.CacDoiTuongHinhHoc.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapeList = {new Circle(45),
                new Rectangle(12, 13),
                new Square(500),
                new Circle(12),
                new Rectangle(2, 5)};
        for (int i = 0; i < shapeList.length-1; i++) {
            for (int j = 0; j < shapeList.length-1-i; j++)
                if (shapeList[j].compareTo(shapeList[j+1]) < 0) {
                    Shape temp = shapeList[j];
                    shapeList[j] = shapeList[j+1];
                    shapeList[j+1] = temp;
                }
        }
        for(Shape s:shapeList){
            System.out.println(s.getArea());
        }
    }
}
