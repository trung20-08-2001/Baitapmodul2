package Bai12.PhanBietHashMapVaHashSet;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;

public class Run {
    public static void main(String[] args) {
        Student student1=new Student("A","Hà Nội", (byte) 19);
        Student student2=new Student("B","Hưng Yên", (byte) 20);
        Student student3=new Student("C","Hải Phòng", (byte) 26);
        Student student4=new Student("D","Hải Dương", (byte) 30);
        HashMap<Integer,Student> hashMap=new HashMap<>();
        HashSet<Student> hashSet=new HashSet<>();
        hashMap.put(1,student1);
        hashMap.put(6,student2);
        hashMap.put(9,student3);
        hashMap.put(3,student4);
        System.out.println("--------HASH MAP--------");
        for(Integer key:hashMap.keySet()){
            System.out.println("Học sinh thứ "+key+": "+hashMap.get(key));
        }
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);
        hashSet.add(student1);
        System.out.println("----------HASH SET---------");
        for(Student student:hashSet){
            System.out.println(student);
        }


    }
}
