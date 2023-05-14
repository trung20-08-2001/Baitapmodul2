package Bai3;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        System.out.println("Thêm phần tử vào mảng");
        int[] arr={1,2,3,4,5,6,7,8,9};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập phần tử muốn thêm:");
        int value=scanner.nextInt();
        System.out.println("Nhập vị trí muốn thêm:");
        int index=scanner.nextInt();
        addValue(value,index,arr);
    }

    public static void addValue(int a,int index,int[] arr) {
        int[] newarr=new int[arr.length+1];
        for(int i=0;i< arr.length;i++){
            if(i<index-1){
                newarr[i]=arr[i];
            }
            if(i==index-1){
                newarr[i]=a;
                newarr[i+1]=arr[i];
            }
            if(i>index-1){
                newarr[i+1]=arr[i];
            }
        }
        System.out.print("Mảng ban đầu: ");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nMảng đã thêm: ");
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
    }
}
