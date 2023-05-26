package Bai17.DocVaGhiDanhSachSinhVienRaFile;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void writeDataToFile(String path, ArrayList<Student> students) {
        try (BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter(path,true))) {
            for(int i=0;i<students.size();i++){
                bufferedWriter.write(students.get(i).toString()+"\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Student> readDataFromFile(String path) {
        ArrayList<Student> students = new ArrayList<>();
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(path))) {
            String line;
            while ((line=bufferedReader.readLine())!=null){
                String[] student=line.split(",");
                students.add(new Student(Integer.parseInt(student[0]),student[1],student[2]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "kjfd", "ehsdi"));
        students.add(new Student(2, "hdsj", "dsonn"));
        students.add(new Student(3, "ediosgh", "ưieos"));
        students.add(new Student(4, "wdn", "hgis"));
        students.add(new Student(5, "ửhois", "fuew"));
        writeDataToFile("C:\\Users\\trung\\IdeaProjects\\Md2\\Baitap\\src\\Bai17\\DocVaGhiDanhSachSinhVienRaFile\\dataStudent.txt", students);
        ArrayList<Student> studentDataFromFile=readDataFromFile("C:\\Users\\trung\\IdeaProjects\\Md2\\Baitap\\src\\Bai17\\DocVaGhiDanhSachSinhVienRaFile\\dataStudent.txt");
        for(Student student:studentDataFromFile){
            System.out.println(student);
        }
    }
}
