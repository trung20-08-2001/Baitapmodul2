package Bai2;
import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        System.out.println("Tìm UCLL của hai số nguyên nhập vào.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất:");
        int a = scanner.nextInt();
        int absOfA = Math.abs(a);
        System.out.println("Nhập số thứ hai:");
        int b = scanner.nextInt();
        int absOfB = Math.abs(b);
        int result = 0;
        if (a == 0 && b == 0) {
            System.out.println("Số 0 không có ước chung.");
        } else if (a == 0) {
            System.out.println("ƯCLL là " + Math.abs(b));
        } else if (b == 0) {
            System.out.println("ƯCLL là " + Math.abs(a));
        } else {
            int i = a;
            while (result == 0) {
                if (absOfA % i == 0 && absOfB % i == 0) {
                    result = i;
                }
                i--;
            }
            System.out.println("ƯCLL của " + a + " và " + b + " là: " + result);
        }
    }
}
