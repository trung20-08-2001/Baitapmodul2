package Bai13.TimChuoiTangDanCoDoDaiLonNhat;

import java.util.ArrayList;
import java.util.Scanner;


public class FindStringMax {
    static public String findStringMax(String str) {
        String result = str.charAt(0)+"";
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i)>result.charAt(result.length()-1)){
                result+=str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập chuỗi:");
            String str = scanner.nextLine();
            System.out.println("Kết quả");
            System.out.println(findStringMax(str));
        }
    }
}
