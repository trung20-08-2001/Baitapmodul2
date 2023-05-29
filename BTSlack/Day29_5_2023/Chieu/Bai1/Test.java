package BTSlack.Day29_5_2023.Chieu.Bai1;

import java.util.Scanner;

public class Test {
    //Tìm chuỗi con có độ dài lớn nhất không chứa các ký tự lặp lại
    //Viết một chương trình để tìm và hiển thị chuỗi con có độ dài
    // lớn nhất trong một chuỗi, sao cho chuỗi con đó không chứa bất
    // kỳ ký tự nào bị lặp lại. Đầu vào là một chuỗi từ người dùng và
    // chương trình sẽ tìm và hiển thị chuỗi con lớn nhất thỏa điều kiện đã cho

    public static String findStringLong(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            String currentString="";
            for(int j=i;j<str.length();j++){
               char c=str.charAt(j);
               if(currentString.indexOf(c)==-1){
                   currentString+=c;
                   if(currentString.length()>result.length()){
                       result=currentString;
                   }
               }else{
                   break;
               }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter string:");
        String str= scanner.nextLine();
        System.out.println(findStringLong(str));
    }
}
