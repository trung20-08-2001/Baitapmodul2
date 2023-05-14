package Bai3;

import java.util.Scanner;
public class TImMinMangHaiChieu {
    public static int[][] createArray2D() {
        System.out.println("Tạo mảng hai chiều.");
        Scanner scanner = new Scanner(System.in);
        int row, col;
        int[][] arr;
        do {
            System.out.println("Nhập số hàng của mảng:");
            row = scanner.nextInt();
            System.out.println("Nhập số cột của mảng: ");
            col = scanner.nextInt();
            if (row <= 0 || col <= 0) {
                System.out.println("Số không hợp lệ.");
            }
        } while (row <= 0 || col <= 0);
        arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập giá trị của arr[" + i + "][" + j + "]:");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Hoàn thành nhập dữ liệu.");
        return arr;
    }
    public static int findMinArray2D(int[][] arr){
        int min=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        return min;

    }
    public static int countMinAlikeOfArraay2D(int min,int[][] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==min){
                    count++;
                }
            }
        }
        return count;
    }
    public static int[][] findAdressOfAllMin(int min,int amountMin,int[][] arr){
        int[][] arrayAdressOfAllMin=new int[amountMin][2];
        int index=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==min){
                    arrayAdressOfAllMin[index][0]=i;
                    arrayAdressOfAllMin[index][1]=j;
                    index++;
                }
            }
        }
        return arrayAdressOfAllMin;
    }

    public static void main(String[] args) {
        System.out.println("Tìm giá trị nhỏ nhất trong mảng hai chiều.");
        int[][] arr=createArray2D();
        int min=findMinArray2D(arr);
        int amountMin=countMinAlikeOfArraay2D(min,arr);
        int[][] adressOfAllMin=findAdressOfAllMin(min,amountMin,arr);
        if(amountMin==1){
            System.out.println("Giá trị nhỏ nhất trong mảng là: "+min+". Vị trí: hàng "+adressOfAllMin[0][0]+" cột "+adressOfAllMin[0][1]);
        }else{
            System.out.println("Giá trị nhỏ nhất trong mảng là: "+min+". Có "+amountMin+" giá trị nhỏ nhất giống nhau.\n Vị trí:");
            for (int i=0;i<adressOfAllMin.length;i++){
                System.out.println("Hàng "+adressOfAllMin[i][0]+" cột "+adressOfAllMin[i][1]);
            }
        }
    }
}
