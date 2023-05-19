package Bai11.DaoNguocPhanTuTrongMangSoNguyenSuDungStack;


import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTuTrongMangSoNguyenSuDungStack {
    Scanner scanner = new Scanner(System.in);

    public Stack<Character> getElement() {
        Stack<Character> stack = new Stack<>();
        System.out.println("Nhập chuỗi cần đảo.");
        String str=scanner.nextLine();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        return stack;
    }
}
