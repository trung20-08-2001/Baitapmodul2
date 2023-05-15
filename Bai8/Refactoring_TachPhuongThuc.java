package Bai8;

import java.util.Scanner;

public class Refactoring_TachPhuongThuc {
    public static double getVolume(double radius, double height) {
        double baseArea = getBaseArea(radius);
        double volume = height * baseArea;
        return volume;
    }


    private static double getBaseArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("TÍNH THỂ TÍCH HÌNH TRỤ.");
            System.out.println("Nhập bán kính:");
            double radius = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập chiều cao:");
            double height = Double.parseDouble(scanner.nextLine());
            System.out.print("Thể tích hình trụ: ");
            System.out.println(getVolume(radius, height) + "\n");
        }

    }

}
