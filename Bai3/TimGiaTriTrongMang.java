package Bai3;

import java.util.Locale;
import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] listName={"AA","BB","CC","DD","EE","FF","GG","HH","JJ"};
        boolean check=false;
        byte number=0;
        System.out.println("Tìm tên sinh viên.");
        System.out.println("Nhập tên cần tìm: ");
        String name=scanner.nextLine();
        String nameUppercase=name.toUpperCase();
        for(byte i=0;i<listName.length;i++){
          if(listName[i].equals(nameUppercase)){
              check=true;
              number=i;
              break;
          }
        }
        if(check){
            System.out.println(name+" ở vị trí "+(number+1)+" trong danh sách.");
        }else{
            System.out.println(name +" không có trong danh sách.");
        }
    }

}
