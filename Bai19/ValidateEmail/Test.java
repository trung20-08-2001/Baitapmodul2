package Bai19.ValidateEmail;

public class Test {
    public static void main(String[] args) {
        EmailExample emailExample=new EmailExample();
        String[] validEmail={"ab@gmail.com","trung@yahoo.com","test@hotmail.com"};
        String[] invalidEmail={"@gmail.com","trung@gmail.","@#abc@gamil.com"};
        for(String s:validEmail){
            boolean isValid= emailExample.validate(s);
            System.out.println("Email is "+s+" is valid: "+isValid);
        }for(String s:invalidEmail){
            boolean isValid= emailExample.validate(s);
            System.out.println("Email is "+s+" is valid: "+isValid);
        }
    }
}
