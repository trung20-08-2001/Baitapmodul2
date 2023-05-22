package Bai12.SapXepVoiComparableVaComparator;


import Bai12.PhanBietHashMapVaHashSet.Student;

import java.util.Collections;
import java.util.LinkedList;

public class Test  {
    public static void main(String[] args) {
        Student student1=new Student("L","Hà Nội", (byte) 19);
        Student student2=new Student("P","Hưng Yên", (byte) 20);
        Student student3=new Student("Y","Hải Phòng", (byte) 26);
        Student student4=new Student("R","Hải Dương", (byte) 30);
        Student student5=new Student("I","Quảng Ninh", (byte) 32);
        Student student6=new Student("B","Thanh Hóa", (byte) 18);
        Student student7=new Student("X","Hải Dương", (byte) 17);
        LinkedList<Student> studentLinkedList=new LinkedList<>();
        studentLinkedList.add(student1);
        studentLinkedList.add(student2);
        studentLinkedList.add(student3);
        studentLinkedList.add(student4);
        studentLinkedList.add(student5);
        studentLinkedList.add(student6);
        studentLinkedList.add(student7);
        System.out.println("-----------Sắp xếp theo tên.-----------\n");
        Collections.sort(studentLinkedList,new NameComparator());
        for(Student student:studentLinkedList){
            System.out.println(student);
        }
        System.out.println("\n----------Sắp xếp theo tuổi.-----------\n");
        Collections.sort(studentLinkedList,new AgeComparator());
        for(Student student:studentLinkedList){
            System.out.println(student);
        }
    }

}
