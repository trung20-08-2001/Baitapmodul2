package Bai3;

import java.util.Scanner;

public class TimMaxMangHaiChieu {
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

    public static int findMaxOfArray2D(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static int coutnAlikeMaxOfArray2D(int max,int[][] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==max){
                    count+=1;
                }
            }
        }
        return count;
    }

    public static int[][] findAdressOfMax(int max,int amountMax, int[][] arr) {
        int index = 0;
        int[][] arrayAdressOfMax = new int[amountMax][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == max) {
                    arrayAdressOfMax[index][0] = i;
                    arrayAdressOfMax[index][1] = j;
                    index++;
                }
            }
        }

        return arrayAdressOfMax;
    }

    public static void main(String[] args) {
        System.out.println("Tìm sô lớn nhất trong mảng hai chiều.");
        int[][] arr = createArray2D();
        int max = findMaxOfArray2D(arr);
        int amountMax=coutnAlikeMaxOfArray2D(max,arr);
        int[][] arrayAdressOfMax = findAdressOfMax(max,amountMax, arr);
        if (arrayAdressOfMax.length == 1) {
            System.out.println("Số lớn nhất trong mảng là: " + max + ". Vị trí: hàng " + arrayAdressOfMax[0][0] + ", cột " + arrayAdressOfMax[0][1]);
        } else {
            System.out.print("Số lớn nhất trong mảng là: "+max+". Có " + amountMax + " giá trị lớn nhất giống nhau.\nVị trí: \n");
            for (int i = 0; i < arrayAdressOfMax.length; i++) {
                System.out.println("hàng " + arrayAdressOfMax[i][0] + ", cột " + arrayAdressOfMax[i][1]);
            }
        }
    }
}

