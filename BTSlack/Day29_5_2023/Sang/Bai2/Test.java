package BTSlack.Day29_5_2023.Sang.Bai2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Tìm số chính phương gần nhất.
        //Viết một hàm nhận đầu vào là một số nguyên dương n
        // và trả về số chính phương gần nhất và nhỏ hơn n.
        FindPerfectSquare test=new FindPerfectSquare();
        Scanner scanner=new Scanner(System.in);
        while(true) {
            System.out.println("Enter number");
            int number = Integer.parseInt(scanner.nextLine());
            int result = test.findPerfectSquare(number);
            if(result<0){
                System.out.println("Number is negative. ");
            }else if(result==0){
                System.out.println("Numbe is zero");
            }else{
                System.out.println("The smallest and closest square of "+number+" is: "+result);
            }
        }
    }
}
