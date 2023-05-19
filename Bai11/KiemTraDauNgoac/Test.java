package Bai11.KiemTraDauNgoac;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        while(true) {
            CheckParentheses test = new CheckParentheses();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập biểu thức:");
            String str = scanner.nextLine();
            if (test.checkParentheses(str)) {
                System.out.println(str + " sử dụng ngoặc đúng cách.");
            } else {
                System.out.println(str + " sử dụng ngoặc sai cách.");
            }
        }
    }
}
