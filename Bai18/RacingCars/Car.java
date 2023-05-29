package Bai18.RacingCars;


import java.util.Date;
import java.util.Random;


public class Car extends Thread {
    private String name;

    private final int DISTANCE;

    public Car(String name, int distance) {
        this.name = name;
        this.DISTANCE = distance;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long timeStartRacing = System.currentTimeMillis();
        while (runDistance < DISTANCE) {
            int speed = new Random().nextInt(20);
            runDistance += speed;
            int step = DISTANCE / 10;
            String distanceCarByTravel = "|";
            for (int i = 0; i < DISTANCE; i += step) {
                if (i < runDistance) {
                    distanceCarByTravel += "=";
                }
                if (i < runDistance && runDistance <= i + step) {
                    distanceCarByTravel += "o";
                }
                if (i > runDistance) {
                    distanceCarByTravel += "-";
                }
            }
            distanceCarByTravel += "|";
            System.out.println("Car " + name + ": " + distanceCarByTravel + " " + runDistance + "KM");
            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car " + name + " broken...");
                break;
            }
        }
        System.out.println("Car " + name + " finish in " + (System.currentTimeMillis() - timeStartRacing) / 1000 + "second");

    }

}
