package BTSlack.Day31_5_2023;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai5 {
    //Kiểm tra một chuỗi có chứa các từ trong danh sách từ cấm hay không.
    // Ví dụ: kiểm tra xem chuỗi có chứa từ “bad” hoặc “evil” không.

    public static boolean validate(String str){
        Pattern pattern=Pattern.compile("(bad|evil)");
        Matcher matcher= pattern.matcher(str);
        return matcher.find();
    }

    public static void main(String[] args) {
        System.out.println(validate(" bad"));
        System.out.println(validate(" evil"));
        System.out.println(validate("good"));
        System.out.println(validate("bad and evil"));
    }
}
