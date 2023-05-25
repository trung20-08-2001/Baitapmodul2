package Bai15;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {

    public IllegalTriangleException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh thứ nhất:");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập cạnh thứ hai:");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập cạnh thứ ba:");
        double side3 = Double.parseDouble(scanner.nextLine());
        try {
            checkTriangle(side1, side2, side3);
            System.out.println(side1+", " +side2+", "+side3+" là ba cạnh của tam giác.");
        }catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkTriangle(double side1,double side2,double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Các cạnh phải là số dương");
        } else if (side1 + side2 < side3 || side1 + side3 < side2 || side3 + side2 < side1) {
            throw new IllegalTriangleException("Các cạnh không hợp lệ.");
        }
    }


}
