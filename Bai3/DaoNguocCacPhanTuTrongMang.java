package Bai3;

import java.util.Scanner;

public class DaoNguocCacPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte size;
        int[] arr;
        System.out.println("Nhận vào kích thước,các phần tử của mảng và hiển thị ra mảng đã đảo ngược.");
        do {
            System.out.println("Nhập số lượng phần tử:");
             size = scanner.nextByte();
            if(size>20){
                System.out.println("Số lượng không hợp lệ, hãy chọn dưới 20 phần tử.");
            }
        }while (size>20);
        arr=new int[size];
        System.out.println("Mời nhập các phần tử.");
        for(byte i=0;i<arr.length;i++){
            System.out.print("Phần tử thứ "+(i+1)+": ");
            arr[i]=scanner.nextInt();
            if(i==arr.length-1) {
                System.out.println("Đã đủ các phần tử.");
                System.out.print("Đây là mảng ban đầu của bạn:");
                for (int k : arr) {
                    System.out.print(k + " ");
                }
            }
        }
        System.out.println("\n");
        for(byte i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.print("Đây là mảng đã đảo ngược: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
