package BTSlack.Day29_5_2023.Sang.Bai1;
import java.util.ArrayList;
import java.util.List;
public class FindNextPerfectNumber {
    public int findNextPerfectNumber(int number) {
        if(isPerfectNumber(number)){
            number++;
        }
        while (true) {
            int sum = 0;
            List<Integer> arrayDivisorOfNumber = findDivisorOfNumber(number);
            for (int i = 0; i < arrayDivisorOfNumber.size(); i++) {
                sum += arrayDivisorOfNumber.get(i);
            }
            if (sum == number) {
                return number;
            }
            number++;
        }
    }

    public List<Integer> findDivisorOfNumber(int number) {
        List<Integer> arrayDivisorOfNumber = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                arrayDivisorOfNumber.add(i);
            }
        }
        return arrayDivisorOfNumber;
    }

    public boolean isPerfectNumber(int number) {
        int sum = 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum += i;

            }
        }
        if (sum == number) {
            return true;
        }
        return false;
    }
}
