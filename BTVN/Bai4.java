package BTVN;

import java.util.Scanner;

public class Bai4 {
    //Viết chương trình để kiểm tra xem một chuỗi ký
    //tự nhập từ bàn phím có phải là chuỗi đối xứng hay không.
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi kí tự:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] arrstr = str.toCharArray();
        boolean check = true;
        for (int i = 0; i < arrstr.length / 2; i++) {
            if (arrstr[i] != arrstr[arrstr.length - 1 - i]) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(str + " là chuỗi đối xứng.");
        } else {
            System.out.println(str + " không là chuỗi đối xứng.");
        }
    }
}
