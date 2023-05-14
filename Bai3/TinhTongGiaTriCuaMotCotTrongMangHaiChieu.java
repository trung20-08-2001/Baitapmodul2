package Bai3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TinhTongGiaTriCuaMotCotTrongMangHaiChieu {
    public static int[][] createArray2D(){
        Scanner scanner = new Scanner(System.in);
        int row,col;
        System.out.println("Tạo mảng hai chiều:");
        do {
            System.out.print("Nhập số hàng:");
            row = scanner.nextInt();
            System.out.print("Nhập số cột:");
            col = scanner.nextInt();
            if(row<=0||col<=0){
                System.out.println("Số lượng không hợp lệ. Nhập lại");
            }
        }while(row<=0||col<=0);
        int[][] arr=new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print("Nhập giá trị của arr["+i+"]["+j+"]:");
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Hoàn thành nhập dữ liệu.");
        return  arr;
    }
    public static int total(int index,int[][] arr){
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i][index-1];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tính tổng một cột của mảng hai chiều.");
        int[][] arr=createArray2D();
        System.out.println("Nhập cột muốn tính tổng:");
        int index= scanner.nextInt();
        int total=total(index,arr);
        System.out.println("Tổng giá trị ở cột "+index+" là: "+total);
    }

}
