package Bai19.ValidatePhone;

public class Test {
    public static void main(String[] args) {
        PhoneExample phoneExample=new PhoneExample();
        String[] example={"(84)-(0978489648)","(84)-(2)12345","(123)-1234567","(12)-(0)!@#$%^&"," (a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};
        String[] phoneVn={"+84375073496","84375037456","+841323"};
        for(String s:example) {
            boolean isValid= phoneExample.validate(s);
            System.out.println("Phone "+s+" is "+isValid);
        }
        System.out.println("Test phone VN");
        for(String s:phoneVn) {
            boolean isValid= phoneExample.validatePhoneVn(s);
            System.out.println("Phone "+s+" is "+isValid);
        }
    }
}
