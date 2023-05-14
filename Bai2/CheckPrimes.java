package Bai2;
import java.util.Scanner;

public class CheckPrimes {
    public static void main(String[] args) {
        System.out.println("Kiểm tra số nguyên tố.");
        System.out.println("Nhập số nguyên cần kiểm tra:");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        boolean check=true;
        if(number<2){
            check=false;
        }else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if(check){
            System.out.println(number+" là số nguyên tố.");
        }else {
            System.out.println(number+" không phải là số nguyên tố.");

        }    }
}
