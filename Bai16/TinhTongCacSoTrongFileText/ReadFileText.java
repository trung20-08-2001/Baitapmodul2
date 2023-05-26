package Bai16.TinhTongCacSoTrongFileText;

import java.io.*;

public class ReadFileText {
    public static void readFileText() {
       String filePath="C:\\Users\\trung\\IdeaProjects\\Md2\\Baitap\\src\\Bai16\\TinhTongCacSoTrongFileText\\file number.txt";
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum+= Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng: "+sum);
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        readFileText();
    }
}
