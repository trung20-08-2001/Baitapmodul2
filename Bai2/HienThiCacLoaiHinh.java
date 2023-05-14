package Bai2;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        System.out.println("Vẽ hình theo yêu cầu:");
        System.out.println("1: Hình chữ nhật.");
        System.out.println("2: Hình tam giác cạnh góc vuông trên bên trái.");
        System.out.println("3: Hình tam giác cạnh góc vuông dưới bên trái.");
        System.out.println("4: Hình tam giác cạnh góc vuông trên bên phải.");
        System.out.println("5: Hình tam giác cạnh góc vuông dưới bên phải.");
        System.out.println("6: Hình tam giác cân.");
        System.out.println("0: Thoát");
        System.out.println("Nhập số:");
        Scanner scanner=new Scanner(System.in);
        byte a=scanner.nextByte();
        switch (a){
            case 1:
                for(int i=0;i<5;i++){
                    for(int j=0;j<10;j++){
                        if (i>0&&i<4){
                            if(j!=0&&j!=9){
                                System.out.print(" ");
                            }else{
                                System.out.print("* ");
                            }
                        }else{
                            System.out.print("* ");
                        }
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                for (int i=5;i >0;i--){
                    for(int j=0;j<i;j++){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                for (int i=1;i<=5;i++){
                    for(int j=0;j<i;j++){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            case 4:
                for(int i=5;i>0;i--){
                    for(int j=5;j>0;j--){
                        if(i>=j){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("\n");
                }
                break;
            case 5:
                for(int i=0;i<=5;i++){
                    for(int j=5;j>0;j--){
                        if(j<=i){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("\n");
                }
                break;
            case 6:
                for (int i=0;i<5;i++){
                    for(int j=0;j<10;j++){
                        if(j>10/2-i&&j<10/2+i){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.print("\n");
                }
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Số không hợp lệ.");
                break;
        }
    }
}
