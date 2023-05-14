package Bai3;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void delValue(double a, double[] array) {
        int sameValue = 0;
        boolean check = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == a) {
                check = true;
                sameValue += 1;
            }
        }
        double[] newarray = new double[array.length - sameValue];
        ;
        if (!check) {
            System.out.print("Trong mảng không có giá trị: " + a);
        } else {
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != a) {
                    newarray[index] = array[i];
                    index++;
                }
            }
            System.out.print("Đây là mảng ban đầu:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.print("\nĐây là mảng đã xóa " + a + " đi: ");
            for (int i = 0; i < newarray.length; i++) {
                System.out.print(newarray[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Xóa phần tử khỏi mảng");
        Scanner scanner = new Scanner(System.in);
        double[] arr = {1.1, 2.2, 3.3, 4.4, 5.5, 5.5, 6.6, 7.7, 8.8, 9.9};
        System.out.println("Nhập giá trị cần xóa:");
        double a = scanner.nextDouble();
        delValue(a, arr);
    }

}
