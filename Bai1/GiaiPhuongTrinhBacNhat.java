package Bai1;
import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Giải phương trình ax+b=0");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a=scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b=scanner.nextDouble();
        double c = -b/a;
        if (a==0){
            if(b==0){
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }else{
            if(b==0){
                System.out.println("Phương trình có một nghiệm duy nhất: x=0");
            }else{
                System.out.println("Phương trình có nghiệm x = "+c);
            }
        }
    }
}
