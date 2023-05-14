package BTVN;

import java.util.Scanner;

public class Bai3 {
    // Viết chương trình để tính tổng của tất cả các số nguyên tố
    // nhỏ hơn hoặc bằng một số được nhập từ bàn phím.
    public static void main(String[] args) {
        System.out.println("Nhập số nuyên bất kì: ");
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int sum=2;
        for(int i=2;i<a;i++){
            int j=CheckSNT(i);
            if(j!=0){
                sum+=i;
            }
        }
        System.out.println("Tổng các SNT đến "+a+" là: "+sum);

    }
    public static int CheckSNT(int a){
        boolean check =true;
        for (int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                check=false;
                break;
            }
        }
        if(check){
            return a;
        }
        return 0;
    }
}
