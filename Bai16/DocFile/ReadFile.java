package Bai16.DocFile;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public String readFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            String content="";
            while ((line = bufferedReader.readLine()) != null) {
                String[] list = new String[3];
                list = line.split(",");
                content+=list[2]+"\n";
            }
            bufferedReader.close();
            return content;
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file path:");
        String filePath = scanner.nextLine();
        String content = readFile.readFile(filePath);
        System.out.println("Country names in your file.");
        System.out.println(content);
    }
}
