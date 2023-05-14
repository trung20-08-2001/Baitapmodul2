package BTVN;

import java.util.Scanner;

public class Bai1 {
    // Viết chương trình để tìm số nguyên tố thứ n (với n là số nguyên dương).
    public static void main(String[] args) {
        while (true) {
            System.out.println("Nhập số nguyên bất kì:");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = TimSoNT(a);
            System.out.println("Số nguyên tố thứ " + a + " là: " + b);
        }

    }

    public static int TimSoNT(int a) {
        int count = 0;
        int result=0;
            for (int i = 1; count <= a; i++) {
                boolean check = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    count++;
                    result = i;
                }
            }
        return result;
    }
}
