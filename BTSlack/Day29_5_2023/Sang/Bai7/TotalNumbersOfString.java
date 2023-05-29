package BTSlack.Day29_5_2023.Sang.Bai7;

import java.util.Scanner;

public class TotalNumbersOfString {
    public static int calculatorTotal(String numberStr){
        int number=Integer.parseInt(numberStr);
        int surplus;
        int sum=0;
        while (number>0){
            surplus=number%10;
            sum+=surplus;
            number=number/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number:");
        String numberStr= scanner.nextLine();
        System.out.println("Total numbers of "+numberStr+": "+calculatorTotal(numberStr));
    }
}
