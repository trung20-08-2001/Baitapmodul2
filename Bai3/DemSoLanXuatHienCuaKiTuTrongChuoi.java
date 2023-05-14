package Bai3;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKiTuTrongChuoi {
    public static void main(String[] args) {
        System.out.println("Đếm số lần xuất hiện của kí tự trong chuỗi.");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi kí tự:");
        String str= scanner.nextLine();
        char[] arraystr=str.toCharArray();
        System.out.print("Nhập kí tự cần tìm:");
        String input=scanner.nextLine();
        char a=input.charAt(0);
        int count=0;
        for(int i=0;i<arraystr.length;i++){
            if(arraystr[i]==a){
                count++;
            }
        }
        if(count==0){
            System.out.println("Trong chuỗi không có kí tự "+a);
        }else{
            System.out.println("Kí tự "+a+" xuất hiện "+count+" lần trong chuỗi.");
        }
    }
}
