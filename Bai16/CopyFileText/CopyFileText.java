package Bai16.CopyFileText;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public void CopyFileText(String fileReader,String fileWrite) throws IOException {
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter = null;
        try {
            Reader reader = new FileReader(fileReader);
            Writer write=new FileWriter(fileWrite);
             bufferedReader = new BufferedReader(reader);
             bufferedWriter =new BufferedWriter(write);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            bufferedReader.close();
            bufferedWriter.close();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        CopyFileText test=new CopyFileText();
        System.out.println("COPY FILE");
        System.out.println("Nhập đường dẫn cần sao chép.");
        String fileCopy= scanner.nextLine();
        System.out.println("Nhập đường dẫn muốn sao chép sang.");
        String fileWrite= scanner.nextLine();
        test.CopyFileText(fileCopy,fileWrite);
        System.out.println("Hoàn thành sao chép.");

    }
}
