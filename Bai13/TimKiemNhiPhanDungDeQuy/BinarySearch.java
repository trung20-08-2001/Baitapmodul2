package Bai13.TimKiemNhiPhanDungDeQuy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {
    static Scanner scanner = new Scanner(System.in);

    static public int[] createdArray() {
        System.out.println("Nhập kích thước mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập giá trị thứ " + (i + 1) + ":");
            int element = Integer.parseInt(scanner.nextLine());
            array[i] = element;
        }
        return array;
    }

    static public int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    static public int binarySearch(int[] arr,int number){
        int fist=0;
        int last=arr.length-1;
        while (fist<=last){
            int mid=(fist+last)/2;
            if(arr[mid]==number){
                return mid;
            }else if(arr[mid]>number){
                last=mid-1;
            }else{
                fist=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        while (true) {
            int[] array = createdArray();
            int[] newArray = sortArray(array);
            System.out.println("Nhập số cần tìm:");
            int number = Integer.parseInt(scanner.nextLine());
            int index = binarySearch(newArray, number);
            if (index >= 0) {
                System.out.println(number + " ở vị trí " + index + " trong mảng.");
            } else {
                System.out.println(number + " không có trong mảng.");
            }
        }
    }
}
