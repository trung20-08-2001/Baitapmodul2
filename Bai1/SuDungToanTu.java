package Bai1;
import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner=new Scanner(System.in); ///khai báo đối tượng scanner
        System.out.println("Width : ");
        width=scanner.nextFloat();
        System.out.println("Height : ");
        height=scanner.nextFloat();
        float area=width*height;
        System.out.println("Area : "+area);
    }
}
