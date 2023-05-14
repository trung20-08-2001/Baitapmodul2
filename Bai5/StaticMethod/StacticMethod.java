package Bai5.StaticMethod;

 class StaticMethod {
    private int rollno;
    private String name;
    private static String college="BBDIT";
    StaticMethod(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    static void change(){
        college="CODEGYM";
    }
    void display (){
        System.out.println(this.rollno+" "+this.name+" "+college);
    }
}
class TestStaticMethod{
    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod a=new StaticMethod(1,"A");
        StaticMethod b=new StaticMethod(2,"B");
        StaticMethod c=new StaticMethod(3,"C");
        a.display();
        b.display();
        c.display();
    }
}