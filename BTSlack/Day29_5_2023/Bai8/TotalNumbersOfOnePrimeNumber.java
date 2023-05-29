package BTSlack.Day29_5_2023.Bai8;

import BTSlack.Day29_5_2023.Bai3.FindMaxOfList;
import BTSlack.Day29_5_2023.Bai7.TotalNumbersOfString;

public class TotalNumbersOfOnePrimeNumber {
    //Tìm số nguyên tố có tổng các chữ số lớn nhất. SNT < 100.

    public static int calculatorTotalNumbersOfOnePrimeNumber(){
        int result=0;
        for(int i=99;i>0;i--){
            if(FindMaxOfList.checkPrimeNumber(i)){
                int number=TotalNumbersOfString.calculatorTotal(String.valueOf(i));
                if(number>result)
               result= number;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println( calculatorTotalNumbersOfOnePrimeNumber());
    }
}
