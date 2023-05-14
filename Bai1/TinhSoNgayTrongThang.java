package Bai1;
import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        System.out.println("Tính số ngày của tháng được nhập vào.");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tháng:");
        int month=scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng "+month+" có 31 ngày.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng "+month+" có 30 ngày.");
                break;
            case 2:
                System.out.println("Tháng 2 có 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("Số tháng không hợp lệ");
        }
    }
}
