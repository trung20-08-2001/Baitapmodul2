package Bai3;

import java.util.Scanner;

public class GopMang {
    public static int[] createArray(int a) {
        System.out.println("Tạo mảng thứ " + a + ": ");
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhập số lượng các phần tử:");
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Số lượng không hợp lệ.");
            }
        } while (size < 0);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Giá trị thứ " + (i + 1) + ":");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Hoàn thành nhập giá trị mảng " + a);
        return arr;
    }

    public static int[] plusArr(int[] arr1, int[] arr2) {
        int[] newarr = new int[arr1.length + arr2.length];
        int index = 0;
        for (int i = 0; i < newarr.length; i++) {
            if (i < arr1.length) {
                newarr[i] = arr1[i];
            }
            if (i >= arr1.length) {
                newarr[i] = arr2[index];
                index++;
            }
        }
        return newarr;
    }

    public static void main(String[] args) {
        System.out.println("Cộng mảng.");
        int[] arr1 = createArray(1);
        int[] arr2 = createArray(2);
        int[] arr3 = plusArr(arr1, arr2);
        System.out.print("Mảng đã cộng: ");
        for (int i : arr3) {
            System.out.print(i + " ");
        }
    }
}
