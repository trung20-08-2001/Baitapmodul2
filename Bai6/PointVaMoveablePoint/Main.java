package Bai6.PointVaMoveablePoint;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point=new Point();
        System.out.println(point.getX());
        System.out.println(point.getY());
        float[] arrAddress=point.getXY();
        System.out.println(Arrays.toString(arrAddress));
        System.out.println(point);
        point.setX(12.3f);
        point.setY(34.6f);
        System.out.println(Arrays.toString(point.getXY()));
        System.out.println(point+"\n");


        MoveablePoint moveablePoint=new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint.setX(45.3f);
        moveablePoint.setY(42.6f);
        moveablePoint.setSpeed(45.3f,12.9f);
        moveablePoint.move();
        System.out.println(moveablePoint.getX());
        System.out.println(moveablePoint.getY());
        System.out.println(moveablePoint);
    }
}
