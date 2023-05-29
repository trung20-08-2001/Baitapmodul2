package BTSlack.Day29_5_2023.Sang.Bai2;

public class FindPerfectSquare {
    public int findPerfectSquare(int number) {
        if(number<0){
            return number;
        }
        for (int i = number; i > 0; number--) {
            double squareRoot=Math.sqrt(number);
            if(squareRoot==Math.floor(squareRoot)){
                return number;
            }
        }
        return 0;
    }
}
