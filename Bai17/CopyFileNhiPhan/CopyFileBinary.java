package Bai17.CopyFileNhiPhan;

import java.io.*;
import java.util.Scanner;

public class CopyFileBinary {
    public static void copyFileBinary(String source, String destination) {
        try (InputStream is = new FileInputStream(source);
             OutputStream os = new FileOutputStream(destination,true)) {
            byte[] buffer = new byte[1024];
            int byteRead;
            while ((byteRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, byteRead);
            }
            System.out.println("Hoàn thành sao chép.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập đường dẫn file muốn copy:");
        String source= scanner.nextLine();
        System.out.println("Nhập đường dẫn  file muốn paste:");
        String destination= scanner.nextLine();
        copyFileBinary(source,destination);
    }
}
