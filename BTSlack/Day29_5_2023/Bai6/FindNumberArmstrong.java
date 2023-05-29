package BTSlack.Day29_5_2023.Bai6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindNumberArmstrong {
    //Tìm số Amstrong trong một khoảng.
    //Viết một hàm nhận đầu vào là hai số nguyên dương start và end, và trả về
    // danh sách các số Amstrong trong khoảng từ start đến end.

    public static ArrayList<Integer> findNumberArmstrong(int start, int end) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        for (int i = start; i < end; i++) {
            String iStr = Integer.toString(i);
            int n = iStr.length();
            int sum = 0;
            for (int j = 0; j < iStr.length(); j++) {
                sum+=Math.pow(Character.getNumericValue(iStr.charAt(j)),n);
            }
            if(sum==i){
                resultArray.add(i);
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number start:");
        int start=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number end:");
        int end=Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> result=findNumberArmstrong(start,end);
        System.out.println("Numbers Armstrong from "+start+" to "+end);
        System.out.println(result);

    }
}
