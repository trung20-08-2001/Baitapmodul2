package Bai17.QuanLiSanPhamLuuVaoFileNhiPhan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerProduct managerProduct=new ManagerProduct();
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("------------QUẢN LÍ SẢN PHẨM------------");
            System.out.println("1. Thêm");
            System.out.println("2. Hiển thị sản phẩm ra file theo kiểu nhị phân.");
            System.out.println("3. Tìm kiếm và in thông tin tìm đc ra file theo kiểu nhị phân.");
            System.out.println("4. Thoát");
            byte choice = 0;
            boolean check;
            do {
                check = true;
                try {
                    choice = Byte.parseByte(scanner.nextLine());
                } catch (Exception e) {
                    check = false;
                    System.out.println("Sai định dạng. Nhập lại.");
                }
            } while (!check);
            switch (choice) {
                case 1:
                    managerProduct.add();
                    break;
                case 2:
                    managerProduct.writeDataToFile();
                    break;
                case 3:
                    managerProduct.findById();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}

