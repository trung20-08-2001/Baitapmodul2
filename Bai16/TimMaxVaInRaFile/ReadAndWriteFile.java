package Bai16.TimMaxVaInRaFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
    public List<Integer> reaFile(String filePath){
        List<Integer> number=new ArrayList<>();
        try{
            File file=new File(filePath);
            if(!file.exists()){
                throw  new FileNotFoundException();
            }
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line="";
            while ((line=br.readLine())!=null){
                number.add(Integer.parseInt(line));
            }
        }catch(NumberFormatException e){
            System.out.println("Số không đúng định dạng.");
        }
        catch(FileNotFoundException e){
            System.out.println("File không tồn tại.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return number;
    }

    public int findMax(List<Integer> number){
        Arrays.sort(new List[]{number});
       return number.get(number.size()-1);
    }

    public void writeFile(String filePath,int max){
        try( FileWriter fileWriter=new FileWriter(filePath);
             BufferedWriter bufferedWriter=new BufferedWriter(fileWriter)){
            bufferedWriter.write("Giá trị lớn nhất là: "+max);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ReadAndWriteFile test=new ReadAndWriteFile();
        System.out.println("Nhập đường dẫn file.");
        String filePath=scanner.nextLine();
        List<Integer> arrayList= test.reaFile(filePath);
        int max=test.findMax(arrayList);
        test.writeFile(filePath,max);

    }

}
