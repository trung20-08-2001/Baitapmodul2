package Bai3;

import java.util.Scanner;

public class TinhTongGiaTriDuongCheoCuaMaTranVuong {
    public static double[][] createArray2D() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tạo ma trận vuông:");
        int row, col;
        do {
            System.out.print("Nhập số hàng:");
            row = scanner.nextInt();
            System.out.print("Nhập số cột:");
            col = scanner.nextInt();
            if (row != col) {
                System.out.println("Số hàng và cột phải bằng nhau, nhập lại.");
            }
        } while (col <= 0 || row != col);
        double[][] arr = new double[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập giá trị của arr[" + i + "][" + j + "]:");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Hoàn thành nhập dữ liệu.");
        return arr;
    }

    public static double[] sumValueOfDiagonals(double[][] arr) {
        int sumOfValueDiagonalStartingFromTopleft = 0;
        int sumOfValueDiagonalStartingFromTopRight = 0;
        double[] result=new double[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sumOfValueDiagonalStartingFromTopleft += arr[i][j];
                }
            }
        }
        result[0]=sumOfValueDiagonalStartingFromTopleft;
        for (int i = arr.length - 1, j = 0; i >= 0 && j < arr.length; i--, j++) {
            sumOfValueDiagonalStartingFromTopRight+=arr[i][j];
        }
        result[1]=sumOfValueDiagonalStartingFromTopRight;
        return result;
    }
    public static void displayAraay2D(double[][] arr){
        System.out.println("Đây là mảng được nhập vào:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("Tính tổng các giá trị trên đường chéo trong ma trận các số thực.");
        double[][] arr=createArray2D();
        displayAraay2D(arr);
        double[] result=sumValueOfDiagonals(arr);
        System.out.println("Tổng của các giá trị trong đường chéo bắt đầu từ góc trên bên trái là: "+result[0]);
        System.out.println("Tổng của các giá trị trong đường chéo bắt đầu từ góc trên bên phải là: "+result[1]);

    }
}

