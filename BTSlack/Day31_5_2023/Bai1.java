package BTSlack.Day31_5_2023;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai1 {

    //Kiểm tra một chuỗi có tuân theo định dạng số điện thoại quốc tế hay không.
    // Một số điện thoại quốc tế bắt đầu bằng dấu “+” và theo sau là mã quốc gia,
    // theo sau là mã vùng (nếu có), và cuối cùng là số điện thoại. Ví dụ: +1-123-456-7890.

    public static boolean validate(String regex){
        return Pattern.matches("^\\+\\d{1,3}(-\\d{0,3})*-\\d{7,13}",regex);
    }

    public static void main(String[] args) {
        System.out.println(validate("+78-345678912"));
        System.out.println(validate("+789-123-123456789"));
        System.out.println(validate("+78-789"));
        System.out.println(validate("+78-1236-123456789"));
        System.out.println(validate("+781236-123456789"));
    }
}
