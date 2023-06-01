package Bai19.ValidateClassName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    public ClassNameExample(){}


    //Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
    //
    //Không chứa các ký tự đặc biệt
    //
    //Theo sau ký tự bắt đầu là 4 ký tự số
    //
    //Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K
    public boolean validate(String regex){
        Pattern pattern=Pattern.compile("^[CAP]\\d{4}[^ \\[\\]\\\\|'/{}!@#$%^&*()-+=<>?\";:,]*[GHIK]$");
        Matcher matcher= pattern.matcher(regex);
        return matcher.matches();
    }

}
