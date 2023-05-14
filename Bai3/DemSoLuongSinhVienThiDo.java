package Bai3;

import java.util.Scanner;

public class DemSoLuongSinhVienThiDo {
    public static byte[] createArrayPoint(){
        Scanner scanner=new Scanner(System.in);
        byte size;
        do{
            System.out.println("Nhập số lượng sinh viên:");
            size=scanner.nextByte();
            if(size<=0||size>30){
                System.out.println("Số lượng không hợp lệ, hãy nhập lại.");
            }
        }while (size<=0||size>30);
        byte[] arr=new byte[size];
        for (byte i=0;i<arr.length;i++){
            do{
                System.out.print("Nhập điểm thí sinh thứ "+(i+1)+": ");
                arr[i]=scanner.nextByte();
                if(arr[i]<0||arr[i]>10){
                    System.out.println("Điểm không hợp lệ. Nhập lại");
                }
            }while (arr[i]<0||arr[i]>10);
        }
        System.out.println("Hoàn thành nhập điểm.");
        return arr;
    }
    public static void checkPointStudent(byte[] arr){
        Scanner scanner=new Scanner(System.in);
        byte point;
        byte count=0;
        do{
            System.out.print("Nhập số điểm tối thiểu để đỗ:");
            point=scanner.nextByte();
            if(point<0||point>10){
                System.out.println("Điểm không hợp lệ. Nhập lại");
            }
        }while (point<0||point>10);
        for(byte i=0;i<arr.length;i++){
            if(arr[i]>=point){
                count++;
            }
        }
        System.out.print("Danh sách điểm:");
        for(byte i:arr){
            System.out.print(i+" ");
        }
        System.out.println("\nCó "+count+" thí sinh đỗ.");
    }

    public static void main(String[] args) {
        System.out.println("Đếm thí sinh thi đỗ.");
        byte[] arr=createArrayPoint();
        checkPointStudent(arr);
    }

}
