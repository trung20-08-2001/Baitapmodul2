package Bai12.PhanBietHashMapVaHashSet;

public class Student {
    private String name;
    private String address;
    private byte age;
    public Student(){}

    public Student(String name, String address, byte age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String toString(){
        return  "Name: "+name+", age: "+age+", địa chỉ: "+address;
    }

}
