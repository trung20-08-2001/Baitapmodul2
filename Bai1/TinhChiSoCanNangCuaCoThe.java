package Bai1;
import java.util.Scanner;

public class TinhChiSoCanNangCuaCoThe {
    public static void main(String[] args) {
        System.out.println("Tính chỉ số cân nặng của cơ thể.");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chiều cao(m):");
        double height=scanner.nextDouble();
        System.out.println("Nhập cân nặng(kg):");
        double weight=scanner.nextDouble();
        double bmi=weight/(height*height);
        if (bmi>0&&bmi<18.5){
            System.out.println("Underweight");
        }else if(bmi<25.0){
            System.out.println("Normal");
        }else if(bmi<30.0){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }
    }
}
