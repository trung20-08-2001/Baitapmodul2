package Bai2;

import java.util.Scanner;

public class ThietKeMenuChoUngDung {
    public static void main(String[] args) {
        System.out.println("Vẽ hình theo yêu cầu:");
        System.out.println("1: Hình chữ nhật");
        System.out.println("2: Hình vuông");
        System.out.println("3: Hình tam giác");
        System.out.println("0.Thoát");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ tự của hình:");
        byte a = scanner.nextByte();
        if(a==0){
            System.exit(0);
        }else
        if (a == 1) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
        }else
        if (a==2){
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
        }else
        if(a==3){
            for (int i=1;i<=5;i++){
                for(int j=1;j<=i;j++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
        }else{
            System.out.println("Số không hợp lệ.");
        }
    }
}
