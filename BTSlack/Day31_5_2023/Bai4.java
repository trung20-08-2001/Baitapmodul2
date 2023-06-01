package BTSlack.Day31_5_2023;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai4 {
    //Tìm và loại bỏ các dấu câu (ví dụ: dấu chấm, dấu phẩy, dấu chấm hỏi) khỏi một câu.
    // Ví dụ: “Hello, how are you?” sẽ trở thành “Hello how are you”.

    public static void main(String[] args) {
        System.out.println(removePunctuation("Hello,[]' how\\?<>\" are you?"));
    }

    public static String removePunctuation(String str){
        return str.replaceAll("[,.?`~!@#$%^&*(){}:;/><\\[\\]\"\\\\']","");
    }
}
