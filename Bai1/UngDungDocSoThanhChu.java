package Bai1;
import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        System.out.println("Ứng dụng đọc số thành chữ.");
        System.out.println("Nhập số:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String a="", b="" , c ="";
        String result;
        if (number <= 10 && number >= 0) {
            switch (number) {
                case 1:
                    System.out.println("Một");
                    break;
                case 2:
                    System.out.println("Hai");
                    break;
                case 3:
                    System.out.println("Ba");
                    break;
                case 4:
                    System.out.println("Bốn");
                    break;
                case 5:
                    System.out.println("Năm");
                    break;
                case 6:
                    System.out.println("Sáu");
                    break;
                case 7:
                    System.out.println("Bảy");
                    break;
                case 8:
                    System.out.println("Tám");
                    break;
                case 9:
                    System.out.println("Chín");
                    break;
                case 10:
                    System.out.println("Mười10");
                    break;
                case 0:
                    System.out.println("Không");
                    break;
            }
        } else if (number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            for (int i = 0; i < 10; i++) {
                if (i == tens) {
                    switch (i) {
                        case 1:
                            b = "Mười";
                            break;
                        case 2:
                            b = "Hai";
                            break;
                        case 3:
                            b = "Ba";
                            break;
                        case 4:
                            b = "Bốn";
                            break;
                        case 5:
                            b = "Năm";
                            break;
                        case 6:
                            b = "Sáu";
                            break;
                        case 7:
                            b = "bảy";
                            break;
                        case 8:
                            b = "Tám";
                            break;
                        case 9:
                            b = "Chín";
                            break;
                    }
                    break;
                }
            }
            for (int i = 0; i < 10; i++) {
                if (i == ones) {
                    switch (i) {
                        case 1:
                            c = "Một";
                            break;
                        case 2:
                            c = "Hai";
                            break;
                        case 3:
                            c = "Ba";
                            break;
                        case 4:
                            c = "Bốn";
                            break;
                        case 5:
                            c = "Năm";
                            break;
                        case 6:
                            c = "Sáu";
                            break;
                        case 7:
                            c = "Bảy";
                            break;
                        case 8:
                            c ="Tám";
                            break;
                        case 9:
                            c = "Chín";
                            break;
                        case 0:
                            c = "Mươi";
                            break;
                    }
                    break;
                }
            }
            result=b+" Mươi "+c;
            if(tens==1){
                result="Mười "+c;
            }
            System.out.println(result);
        }else if(number<1000){
            int hundreds=number/100;
            int tens=(number/10)%10;
            int ones=number%10;
            for(int i=1;i<10;i++){
                if(i==hundreds){
                    switch (i) {
                        case 1:
                            a = "Một";
                            break;
                        case 2:
                            a = "Hai";
                            break;
                        case 3:
                            a = "Ba";
                            break;
                        case 4:
                            a = "Bốn";
                            break;
                        case 5:
                            a = "Năm";
                            break;
                        case 6:
                            a = "Sáu";
                            break;
                        case 7:
                            a = "bảy";
                            break;
                        case 8:
                            a = "Tám";
                            break;
                        case 9:
                            a = "Chín";
                            break;
                    }
                    break;
                }
            }
            for(int i=0;i<10;i++){
                if (i==tens){
                    switch (i) {
                        case 1:
                            b = "Mười";
                            break;
                        case 2:
                            b = "Hai";
                            break;
                        case 3:
                            b = "Ba";
                            break;
                        case 4:
                            b = "Bốn";
                            break;
                        case 5:
                            b = "Năm";
                            break;
                        case 6:
                            b = "Sáu";
                            break;
                        case 7:
                            b = "bảy";
                            break;
                        case 8:
                            b = "Tám";
                            break;
                        case 9:
                            b = "Chín";
                            break;
                        case 0:
                            b = "Linh";
                            break;
                    }
                    break;
                }
            }
            for(int i=0;i<10;i++){
                if (i==ones){
                    switch (i) {
                        case 1:
                            c = "Một";
                            break;
                        case 2:
                            c = "Hai";
                            break;
                        case 3:
                            c = "Ba";
                            break;
                        case 4:
                            c = "Bốn";
                            break;
                        case 5:
                            c = "Năm";
                            break;
                        case 6:
                            c = "Sáu";
                            break;
                        case 7:
                            c = "bảy";
                            break;
                        case 8:
                            c = "Tám";
                            break;
                        case 9:
                            c = "Chín";
                            break;
                    }
                    break;
                }
            }
            result=a+" Trăm "+b+" Mươi "+c;
            if (tens==0&&ones==0){
                result=a+" Trăm.";
            }
            System.out.println(result);

        }else{
            System.out.println("Số lớn quá chưa học tới ");
        }

    }
}
