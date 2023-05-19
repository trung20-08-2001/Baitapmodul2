package Bai11.KiemTraDoiXung;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true) {
            CheckPalindrome test = new CheckPalindrome();
            System.out.println("Nhập chuỗi: ");
            String str=scanner.nextLine();
            if(test.checkPalindrome(str)){
                System.out.println(str +" là chuỗi Palindrome.");
            }else{
                System.out.println(str +" không là chuỗi Palindrome.");
            }
            System.out.println("--------------------------");

        }
    }
}
