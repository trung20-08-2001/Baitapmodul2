package BTSlack.Day29_5_2023.Bai1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Tìm số hoàn thiện tiếp theo.
        //Viết một hàm nhận đầu vào là một số nguyên dương n và trả về số hoàn thiện lớn hơn n đầu tiên.
        FindNextPerfectNumber test=new FindNextPerfectNumber();
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("Enter number:");
            int number = Integer.parseInt(scanner.nextLine());
            int result = test.findNextPerfectNumber(number);
            System.out.println("Next Perfect Number: " + result);
        }
    }
}
