package Bai11.ChuyenDoiThapPhanSangNhiPhan;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public Stack convertDecimalToBinary(int number) {
        Stack<Integer> newStack = new Stack<>();
        while (number > 0) {
            newStack.push(number % 2);
            number = number / 2;
        }
        return newStack;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Convert convert = new Convert();
            System.out.println("Nhập số");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.print(number + " khi chuyển sang hệ nhị phân: ");
            Stack newStack = convert.convertDecimalToBinary(number);
            while (!newStack.isEmpty())
                System.out.print(newStack.pop());
            System.out.println("\n------------------");

        }
    }

}
