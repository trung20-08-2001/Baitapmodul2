package Bai4;

import java.util.Scanner;

public class HinhChuNhat {
    double height, width;

    public HinhChuNhat(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return "chiều dài: " + this.width + ", chiều rộng: " + this.height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tạo hình chữ nhật.");
        double width, height;
        do {
            System.out.println("Nhập chiều dài:");
            width = scanner.nextDouble();
            System.out.println("Nhập chiều rộng:");
            height = scanner.nextDouble();
            if (width < height) {
                System.out.println("Chiều dài phải lớn hơn chiều rộng. Nhập lại:");
            }
        } while (width < height);
        HinhChuNhat hinhChuNhat = new HinhChuNhat(height, width);
        System.out.println("Area: " + hinhChuNhat.getArea());
        System.out.println("Perimeter: " + hinhChuNhat.getPerimeter());
        System.out.println("Hình chữ nhật có " + hinhChuNhat.display());
    }
}
