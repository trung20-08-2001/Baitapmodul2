package BTSlack.Day31_5_2023;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai3 {
    //Kiểm tra một chuỗi có chứa các từ viết hoa được viết liền nhau mà không có khoảng trắng.
    // Ví dụ: “HELLOHOWAREYOU” sẽ được coi là không hợp lệ, trong khi “HELLO HOW ARE YOU” sẽ được coi là hợp lệ.


    public static boolean validate(String str) {
        Pattern pattern=Pattern.compile("^[A-Z]([A-Z]+ )+[A-Z]+$");
        Matcher matcher= pattern.matcher(str);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(validate("HELLOHOWAREYOU"));
        System.out.println(validate("HELLO HOW ARE YOU"));
    }
}
