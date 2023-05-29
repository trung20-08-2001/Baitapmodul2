package BTSlack.Day29_5_2023.Sang.Bai3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Tìm số nguyên tố lớn nhất trong một danh sách.
        //Viết một hàm  nhận đầu vào là một danh sách các số
        // và trả về số nguyên tố lớn nhất trong danh sách đó.
        FindMaxOfList test=new FindMaxOfList();
        int[] array= test.createdList();
       int result= test.findPrimeNumberMax(array);
       if(result==-1){
           System.out.println("There are no prime in the list.");
       }else{
           System.out.println("Prime number max: "+result);
       }
    }
}
