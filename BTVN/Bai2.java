package BTVN;

import java.util.Scanner;

public class Bai2 {
    //Viết chương trình để tìm tất cả các số hoàn hảo trong một khoảng số được nhập từ bàn phím.
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tìm số hoàn hảo trong khoảng a đến b.");
        System.out.println("Nhập a: ");
        int a= scanner.nextInt();
        System.out.println("Nhâp b: ");
        int b= scanner.nextInt();
        String result=" ";
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        for(int i=a;i<=b;i++){
            int sum=1;
            for (int j=2;j<i;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum==i&&a!=1){
                result+=i+" ";
            }
        }
        if(result==" "){
            System.out.println("Trong khoảng từ "+a+" đến "+b+" không có số hoàn hảo.");
        }else{
            System.out.print("Số hoàn hảo: "+result);

        }
    }
}
