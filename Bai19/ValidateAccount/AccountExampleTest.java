package Bai19.ValidateAccount;

public class AccountExampleTest {
    public static void main(String[] args) {
        String[] validAccount={"123abc_","_abc123","______","123456","abcdefg"};
        String[] invalidAccount={"@","12345","1234_","abcde"};
        AccountExample accountExample=new AccountExample();
        for(String s:validAccount){
           boolean isValid= accountExample.validate(s);
            System.out.println("Account is "+ s+" is valid: "+isValid);
        }
        for(String s:invalidAccount){
           boolean isValid= accountExample.validate(s);
            System.out.println("Account is "+ s+" is valid: "+isValid);
        }
    }
}
