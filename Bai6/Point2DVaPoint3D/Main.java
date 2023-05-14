package Bai6.Point2DVaPoint3D;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D=new Point2D();
        System.out.println(point2D);
        point2D.setXY(12,15);
        System.out.println(point2D);
        float[] arr=point2D.getXY();
        System.out.println(Arrays.toString(arr));

        Point3D point3D=new Point3D();
        System.out.println(point3D);
        point3D.setXYZ(4.5f,15.2f,64.1f);
        System.out.println(point3D);
        System.out.println(point3D.getX());
        float[] arr3d=point3D.getXYZ();
        System.out.println(Arrays.toString(arr3d));
    }
}
