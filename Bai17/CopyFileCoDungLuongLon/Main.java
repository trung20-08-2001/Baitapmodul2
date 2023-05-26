package Bai17.CopyFileCoDungLuongLon;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    public static void copyFileJava7File(File source, File dest){
        try {
            Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is=null;
        OutputStream os=null;
        try{
            is=new FileInputStream(source);
            os=new FileOutputStream(dest);
            byte[] buffer=new byte[1024];
            int length;
            while ((length=is.read(buffer))>0){
                os.write(buffer,0,length);
            }
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập đường dẫn cần sao chép.");
        String source= scanner.nextLine();
        System.out.println("Nhập đường dẫn của tệp muốn sao chép đến.");
        String dest= scanner.nextLine();
        File sourceFile=new File(source);
        File destFile=new File(dest);
        copyFileJava7File(sourceFile,destFile);
        copyFileUsingStream(sourceFile,destFile);
        System.out.println("Hoàn thành sao chép.");
    }

}
