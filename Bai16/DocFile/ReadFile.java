package Bai16.DocFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public String readFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String content="";
            while ((line = bufferedReader.readLine()) != null) {
                String[] list = new String[3];
                list = line.split(",");
                content+=list[2]+"\n";
            }
            bufferedReader.close();
            return content;
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file:");
        String filePath = scanner.nextLine();
        String content = readFile.readFile(filePath);
        System.out.println("Tên các quốc gia trong file của bạn.");
        System.out.println(content);
    }
}
