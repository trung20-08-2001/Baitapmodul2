package Bai15;

import java.util.Scanner;

public class UsedNumberFormatException {
    public static void calculate(double number1,double number2){
        try {
            double total=number1+number2;
            double subtraction=number1-number1;
            double multiplication=number1*number2;
            int division=(int)number1/(int)number2;
            System.out.println("Tổng của "+number1+" và "+number2+" là: "+total);
            System.out.println("Hiệu của "+number1+" và "+number2+" là: "+subtraction);
            System.out.println("Tích của "+number1+" và "+number2+" là: "+multiplication);
            System.out.println("Thương của "+number1+" và "+number2+" là: "+division);
        } catch (ArithmeticException e){
            System.out.println("Có ngoại lệ: "+e.getMessage());
        }
    }


    public static void main(String[] args) {
        while (true) {
            Scanner scanner =new Scanner(System.in);
            System.out.println("Nhập số thữ nhất:");
            double number1=Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập số thữ hai:");
            double number2=Double.parseDouble(scanner.nextLine());
            calculate(number1,number2);
        }
    }
}
