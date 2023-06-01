package Bai19.ValidateAccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    public AccountExample(){}
    public boolean validate(String regex){
        Pattern pattern=Pattern.compile("^[_a-z0-9]{6,}$");
        Matcher matcher= pattern.matcher(regex);
        return matcher.matches();
    }

}
