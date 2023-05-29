package BTSlack.Day29_5_2023.Sang.Bai3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindMaxOfList {
    Scanner scanner = new Scanner(System.in);

    public int[] createdList() {
        System.out.println("Enter size array:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] numberArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number: ");
            numberArray[i] = Integer.parseInt(scanner.nextLine());
        }
        return numberArray;
    }

    public static boolean checkPrimeNumber(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static int findPrimeNumberMax(int[] array) {
        Arrays.sort(array);
        for(int i=array.length-1;i>=0;i--){
            if(checkPrimeNumber(array[i])){
                return array[i];
            }
        }
        return -1;
    }
}
