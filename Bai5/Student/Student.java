package Bai5;

public class Student {
    String name="T";
    String classes="C02";

    Student() {
    }

    void setName(String name) {
        this.name = name;
    }

    void setClasses(String classes) {
        this.classes = classes;
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.name);
        System.out.println(student1.classes);
        student1.setName("ádfsdhgk");
        student1.setClasses("C23");
        System.out.println(student1.name);
        System.out.println(student1.classes);
    }
}
