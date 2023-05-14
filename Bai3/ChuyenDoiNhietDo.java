package Bai3;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        byte selected;
        System.out.println("Chuyến đổi nhiệt độ.");
        do{
        System.out.println("Mời lựa chọn:");
        System.out.println("1.Độ C=> Độ F");
        System.out.println("2.Độ F=> Độ C");
            System.out.println("0.Thoát.");
        selected=scanner.nextByte();
        if(selected!=1&&selected!=2){
            System.out.println("Lựa chọn không hợp lệ.");
        }
        }while (selected!=1&&selected!=2);
        System.out.println("Nhập nhiệt độ cần đổi:");
        double temperatureInput=scanner.nextDouble();
        double temperatureOutput;
        if(selected==1){
            temperatureOutput=32+temperatureInput*9/5;
            System.out.println(temperatureInput+" Độ C=  "+temperatureOutput+" Độ F");
        }
        if(selected==2){
            temperatureOutput=(temperatureInput-32)*5/9;
            System.out.println(temperatureInput+" Độ F = "+temperatureOutput+" Độ C");
        }
        if(selected==0){
            System.exit(0);
        }
    }
}
