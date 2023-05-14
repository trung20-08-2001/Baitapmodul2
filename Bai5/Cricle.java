package Bai5;

public class Cricle {
    private double radius;
    private String color;
    public Cricle(){
        this.radius=1;
        this.color="red";
    }
      Cricle(double radius){
        this.radius=radius;
        this.color="red";
    }
    double getRadius(){
        return this.radius;
    }
     double getArea(){
        return Math.PI*this.radius*this.radius;
    }

    public static void main(String[] args) {
        Cricle cricle1=new Cricle();
        Cricle cricle2=new Cricle(3);
        System.out.println(cricle1.getRadius());
        System.out.println(cricle1.getArea());
        System.out.println(cricle2.getRadius());
        System.out.println(cricle2.getArea());

    }
}
