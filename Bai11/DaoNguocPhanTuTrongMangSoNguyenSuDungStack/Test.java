package Bai11.DaoNguocPhanTuTrongMangSoNguyenSuDungStack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        DaoNguocPhanTuTrongMangSoNguyenSuDungStack test = new DaoNguocPhanTuTrongMangSoNguyenSuDungStack();
        Stack<Character> result = test.getElement();
        while (!result.isEmpty()) {
            System.out.print(result.pop());
        }
    }
}

