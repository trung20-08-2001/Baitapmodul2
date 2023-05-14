package Bai2;
import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        System.out.println("Tính tiền lãi.");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Số tiền gửi:");
        int manysend=scanner.nextInt();
        System.out.println("Nhập tỉ lệ lãi suất(% năm):");
        double interestRate=scanner.nextDouble();
        System.out.println("Thời gian gửi(tháng):");
        int time=scanner.nextInt();
        double many=manysend*interestRate/12*time;
        System.out.println("Số tiền nhận được sau "+time+" tháng là: "+many);
    }
}
