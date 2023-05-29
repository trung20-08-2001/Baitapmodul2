package Bai18.RacingCars;


import java.util.Date;


public class Main {
    public static void main(String[] args) {
        int distance=100;
        Car car1=new Car("A",distance);
        Car car2=new Car("B",distance);
        Car car3=new Car("C",distance);

        car1.start();
        car2.start();
        car3.start();

    }
}
