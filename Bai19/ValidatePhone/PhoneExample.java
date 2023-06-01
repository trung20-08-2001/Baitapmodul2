package Bai19.ValidatePhone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {

    public PhoneExample(){}

    public boolean validate(String regex){
        Pattern pattern=Pattern.compile("^[(]\\d{2}[)]-[(]0\\d{9}[)]");
        Matcher matcher= pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean validatePhoneVn(String regex){
        Pattern pattern=Pattern.compile("^[+]84\\d{9}");
        Matcher matcher= pattern.matcher(regex);
        return matcher.matches();
    }
}