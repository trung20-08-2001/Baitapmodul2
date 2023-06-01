package Bai19.ValidateClassName;

public class Test {
    public static void main(String[] args) {
        ClassNameExample classNameExample=new ClassNameExample();
        String[] valid={"C0323H","A2345K","P4567G"};
        String[] invalid={"M0987O","P0923Y","G1234Y"};
        for(String s:valid){
            boolean isValid= classNameExample.validate(s);
            System.out.println("Class name: "+s+" is "+isValid);
        }
        for(String s:invalid){
            boolean isValid= classNameExample.validate(s);
            System.out.println("Class name: "+s+" is "+isValid);
        }
    }
}
