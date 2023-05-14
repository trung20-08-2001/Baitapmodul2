package Bai1;
import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        System.out.println("Hiển thị lời chào.");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Your name:");
        String name= scanner.nextLine();
        System.out.println("Hello "+name);
    }
}
