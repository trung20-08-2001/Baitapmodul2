package Bai4.ManagerStudent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerStudent managerStudent = new ManagerStudent();
        System.out.println("Quản Lí Học Sinh.");
        while (true) {
            System.out.println("1.Hiển thị danh sách học sinh.");
            System.out.println("2.Thêm học sinh.");
            System.out.println("3.Sửa thông tin.");
            System.out.println("4.Xóa một học sinh.");
            System.out.println("5.Thoát.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    managerStudent.display();
                    break;
                case 2:
                    managerStudent.add();
                    break;
                case 3:
                    managerStudent.fix();
                    break;
                case 4:
                    managerStudent.del();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
