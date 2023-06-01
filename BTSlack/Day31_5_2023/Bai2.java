package BTSlack.Day31_5_2023;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai2 {
    //Tách các từ khỏi một chuỗi có chứa các từ được viết liền nhau mà không có khoảng trắng.
    // Ví dụ: “HelloWorldHowAreYou” sẽ được tách thành “Hello World How Are You”.


    public boolean validate(String regex){
        return Pattern.matches("[A-Z][a-z]*",regex);
    }

    public static void main(String[] args) {
        String a="HelloWorldHowAreYou";
        Pattern pattern=Pattern.compile("([A-Z][a-z]*)");
        Matcher matcher= pattern.matcher(a);
        while (matcher.find()){
            System.out.print(matcher.group()+" ");
        }
    }

}
