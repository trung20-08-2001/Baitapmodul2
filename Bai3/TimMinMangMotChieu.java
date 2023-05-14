package Bai3;

import java.util.Scanner;

public class TimMinMangMotChieu {
    public static int findMinValue(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int[] findAlike(int a, int[] arr) {
        int index = 0;
        int[] locationAlike = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                locationAlike[index] = (i + 1);
                index++;
            }
        }
        return locationAlike;
    }

    public static void main(String[] args) {
        System.out.println("Tìm giá giá trị nhỏ nhất trong mảng.");
        Scanner scanner = new Scanner(System.in);
        byte size;
        do {
            System.out.println("Nhập số lượng các phần tử:");
            size = scanner.nextByte();
            if (size <= 0 || size > 20) {
                System.out.println("Số lượng không hợp lệ.");
            }
        } while (size < 0 || size > 20);
        System.out.println("Bắt đầu nhập các phần tử.");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập giá trị thứ " + (i + 1) + " :");
            arr[i] = scanner.nextInt();
        }
        int index = findMinValue(arr);
        int[] location = findAlike(arr[index], arr);
        if (location[0] == 0) {
            System.out.println("Giá trị nhỏ nhất là: " + arr[index] + " vị trí thứ " + index);
        } else {
            System.out.println("Giá trị nhỏ nhất là: " + arr[index]);
            System.out.print("Ở các vị trí: ");
            for (int i = 0; i < location.length; i++) {
                if (location[i] == 0) {
                    break;
                } else {
                    System.out.print(location[i] + " ");
                }
            }
        }
    }
}
