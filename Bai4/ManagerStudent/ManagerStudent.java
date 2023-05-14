package Bai4.ManagerStudent;

import java.util.Scanner;

public class ManagerStudent {
    Student[] students=new Student[0];
    Scanner scanner=new Scanner(System.in);
    ManagerStudent(){
    }
    public void display(){
        if(students.length==0){
            System.out.println("Không có học sinh nào.");
        }else {
            for (Student s : students) {
                System.out.println("ID: " + s.getId() + ". Name: " + s.getName() + ". Age: " + s.getAge());
            }
        }
    }
    public void add(){
        System.out.println("Thêm học sinh.");
        int id;
        boolean check;
        do {
            check=false;
            System.out.println("Nhập ID: ");
            id = Integer.parseInt(scanner.nextLine());
            for (int i=0;i<students.length;i++){
                if(students[i].getId()==id){
                    check=true;
                    System.out.println("ID đẫ tồn tại, nhập lại.");
                }
            }
        }while (check);
        System.out.println("Nhập tên: ");
        String name=scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age=Integer.parseInt(scanner.nextLine());
        Student newStudent=new Student(id,name,age);
        Student[] newStudents=new Student[students.length+1];
        newStudents[newStudents.length-1]=newStudent;
        for(int i=0;i<students.length;i++){
            newStudents[i]=students[i];
        }
        students=newStudents;
    }
    public void fix(){
        System.out.println("Sửa.");
        System.out.println("Nhập ID cần sửa: ");
        int id=Integer.parseInt(scanner.nextLine());
        boolean check=false;
        int index=0;
        for(int i=0;i<students.length;i++){
            if(students[i].getId()==id){
                check=true;
                index=i;
                break;
            }
        }
        if(!check){
            System.out.println("Không có ID "+id+" trong danh sách.");
        }else{
            System.out.println("Nhập tên muốn sửa: ");
            String name=scanner.nextLine();
            System.out.println("Nhập tuổi muốn sửa: ");
            int age=Integer.parseInt(scanner.nextLine());
            students[index]=new Student(id,name,age);
        }
    }
    public void del(){
        if(students.length==0){
            System.out.println("Không có học sinh nào để xóa");
        }else {
            System.out.println("Xóa.");
            System.out.print("Nhập ID cần xóa: ");
            int id = Integer.parseInt(scanner.nextLine());
            boolean check = false;
            int index = 0;
            for (int i = 0; i < students.length; i++) {
                if (students[i].getId() == id) {
                    check = true;
                    index = i;
                    break;
                }
            }
            if (!check) {
                System.out.println("Không có ID " + id + " trong danh sách.");
            } else {
                Student[] newStudents=new Student[students.length-1];
                for(int i=0;i<students.length;i++){
                   if(i<index) {
                       newStudents[i] = students[i];
                   }else{
                       newStudents[i-1]=students[i];
                   }
                }
                students=newStudents;
            }
        }
    }

}
