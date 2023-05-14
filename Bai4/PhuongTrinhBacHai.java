package Bai4;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    private double a,b,c;
    public void getter(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập các hệ số của pt:ax2+bx+c=0.");
        System.out.print("a: ");
        this.a=scanner.nextDouble();
        System.out.print("b: ");
        this.b=scanner.nextDouble();
        System.out.print("c: ");
        this.c=scanner.nextDouble();
    }
    public double setDelta(){
        return Math.pow(this.b,2)-4*this.a*this.c;
    }
    public void result(){
        double delta=setDelta();
        if(delta<0){
            System.out.println("Pt vô nghiệm");
        }
        if(delta==0){
            System.out.println("Pt trình có 1 nghiệm: "+(-this.b/(2*a)));
        }
        if(delta>0){
            System.out.println("Pt có hai nghiệm:");
            System.out.println("x1= "+(-this.b+Math.sqrt(delta))/(2*this.a));
            System.out.println("x1= "+(-this.b-Math.sqrt(delta))/(2*this.a));
        }
    }

    public static void main(String[] args) {
        System.out.println("Phương trình bậc hai.");
        PhuongTrinhBacHai test=new PhuongTrinhBacHai();
        test.getter();
        test.result();
    }
}
