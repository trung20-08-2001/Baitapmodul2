package Bai9.FizzBuzz;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        boolean fizz = number % 3 == 0;
        boolean buzz = number % 5 == 0;
        boolean fizzOfString = false;
        boolean buzzOfString = false;
        String numberString = Integer.toString(number);
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) == '3') {
                fizzOfString = true;
            }
            if (numberString.charAt(i) == '5') {
                buzzOfString = true;
            }
        }
        if (fizz && buzz) {
            return "FizzBuzz";
        }
        if (fizz && fizzOfString) {
            return "Fizz";
        }
        if (buzz && buzzOfString) {
            return "Buzz";
        }
        return numberString;
    }

    public static String translate(int number) {
        String numberString = Integer.toString(number);
        String a = "";
        String b = "";
        if (number>=0&&number<=10) {
           switch (number){
               case 0:
                   a="Không";
                   break;
               case 1:
                   a="Một";
                   break;
               case 2:
                   a="Hai";
                   break;
               case 3:
                  a="Ba";
                   break;
               case 4:
                   a="Bốn";
                   break;
               case 5:
                   a="Năm";
                   break;
               case 6:
                   a="Sáu";
                   break;
               case 7:
                   a="Bảy";
                   break;
               case 8:
                   a="Tám";
                   break;
               case 9:
                   a="Chín";
                   break;
               case 10:
                   a="Mười";
           }
        } else if (number > 10 && number < 100) {
            switch (numberString.charAt(0)) {
                case '1':
                    a = "Mười";
                    break;
                case '2':
                    a = "Hai";
                    break;
                case '3':
                    a = "Ba";
                    break;
                case '4':
                    a = "Bốn";
                    break;
                case '5':
                    a = "Năm";
                    break;
                case '6':
                    a = "Sáu";
                    break;
                case '7':
                    a = "Bảy";
                    break;
                case '8':
                    a = "Tám";
                    break;
                case '9':
                    a = "Chín";
                    break;
            }
            switch (numberString.charAt(1)) {
                case '0':
                    b = "Mươi";
                    break;
                case '1':
                    b = "Một";
                    break;
                case '2':
                    b = "Hai";
                    break;
                case '3':
                    b = "Ba";
                    break;
                case '4':
                    b = "Bốn";
                    break;
                case '5':
                    b = "Năm";
                    break;
                case '6':
                    b = "Sáu";
                    break;
                case '7':
                    b = "Bảy";
                    break;
                case '8':
                    b = "Tám";
                    break;
                case '9':
                    b = "Chín";
                    break;
            }
        }
        return a +" " +b;
    }

    public static void main(String[] args) {
        System.out.println(FizzBuzz.translate(20));
        System.out.println(FizzBuzz.translate(2));
        System.out.println(FizzBuzz.translate(3));
        System.out.println(FizzBuzz.translate(12));
        System.out.println(FizzBuzz.translate(70));
        System.out.println(FizzBuzz.translate(23));
        System.out.println(FizzBuzz.translate(45));
        System.out.println(FizzBuzz.translate(44));


    }
}
