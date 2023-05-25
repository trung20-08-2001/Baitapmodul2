package Bai15;

import java.util.Random;
import java.util.Scanner;

public class UsedArrayIndexOutOfBoundsException {
    public static int[] createdArray(){
        Random random=new Random();
        int[] arr=new int[100];
        for(int i=0;i<100;i++){
            int number= random.nextInt(100);
            arr[i]=number;
        }
        return  arr;
    }

    public static void main(String[] args) {
        while ((true)) {
            Scanner scanner = new Scanner(System.in);
            int[] arr = createdArray();
            System.out.println("Nhập vị trí của phần tử muốn tìm.");
            int index = Integer.parseInt(scanner.nextLine());
            try {
                System.out.println("Phần tử tại vị trí " + index + " là " + arr[index]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Vị trí không hợp lệ.");
            }
        }
    }

}
