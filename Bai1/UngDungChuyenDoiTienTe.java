package Bai1;
import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        System.out.println("Chuyển đổi tiền tệ.");
        System.out.println("Nhập số tiền USD cần đổi:");
        Scanner scanner=new Scanner(System.in);
        double manyUSD=scanner.nextDouble();
        double manyVND=manyUSD*23000;
        System.out.println(manyUSD +" USD = "+manyVND+" VND");
    }
}
