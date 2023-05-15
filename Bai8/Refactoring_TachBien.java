package Bai8;

import java.util.Scanner;

public class Refactoring_TachBien {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if(isFizz && isBuzz)
            return number +" Chia hết cho 3 và 5.";

        if(isFizz)
            return number+ " Chia hết cho 3.";

        if(isBuzz)
            return number+ " Chia hết cho 5.";

        return number + " Không chia hết cho 3 và 5";
    }

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kiểm tra chia hết cho 3 và 5.");
            System.out.println("Nhập số bất kì.");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println(fizzBuzz(number)+"\n");
        }

    }
}
