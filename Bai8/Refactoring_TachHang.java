package Bai8;

import java.util.Scanner;

public class Refactoring_TachHang {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static double calculate(double firstOperand, double secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return (double)firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
    public static char checkChoice(){
        Scanner scanner=new Scanner(System.in);
        byte choice;
        do {
            System.out.println("Chọn phép toán.");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            choice= Byte.parseByte(scanner.nextLine());
            switch (choice) {
                case 1:
                    return ADDITION;
                case 2:
                    return SUBTRACTION;
                case 3:
                    return MULTIPLICATION;
                case 4:
                    return DIVISION;
                default:
                    System.out.println("Chọn lại");

            }
        }while (choice>4||choice<1);
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("MÁY TÍNH.");
        System.out.println("Nhập số thứ nhất.");
        double firstOperand=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số thứ hai.");
        double secondOperand=Double.parseDouble(scanner.nextLine());
        char choice=checkChoice();
        double result=calculate(firstOperand,secondOperand,choice);
        System.out.println("Kết quả:");
        System.out.println(firstOperand+" "+choice+" "+secondOperand+" = "+result);

    }
}
