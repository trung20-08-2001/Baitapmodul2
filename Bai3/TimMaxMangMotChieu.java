package Bai3;
import java.util.Scanner;

public class TimMaxMangMotChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tìm người có nhiều tiền nhất từ danh sách nhập vào.");
        byte amount;
        byte number=0;
        byte alike=0;
        do {
            System.out.println("Nhập số lượng người trong dánh sách(tối đa 20 người):");
            amount = scanner.nextByte();
        } while (amount > 20);
        int[] listInput = new int[amount];
        for (byte i = 0; i < listInput.length; i++) {
            System.out.println("Nhập số tiền của người thứ "+(i+1)+":");
            listInput[i] = scanner.nextInt();
            if(i==listInput.length-1){
                System.out.println("Đã đủ số lượng.");
            }
        }
        int max=listInput[0];
        byte[] locationAlike=new byte[amount];
        byte index=0;
        for (byte i = 0; i < listInput.length; i++) {
            if(listInput[i]>max){
                max=listInput[i];
                number=i;
            }
        }
        for(byte i=0;i<listInput.length;i++){
            if(listInput[i]==max){
                alike+=1;
                locationAlike[index]=i;
                index++;
            }
        }
        if(alike==0) {
            System.out.println("Người ở số thứ tự " + (number + 1) + " có nhiều tiền nhất: " + max + " tỉ USD.");
        }else{
            System.out.println("Có "+alike+" người cùng có nhiều tiền nhất: "+max+" tỉ USD.");
            System.out.print("Ở vị trí: ");
            for(byte i=0;i<index;i++){
                System.out.print((locationAlike[i]+1)+" ");
            }
        }
    }
}
