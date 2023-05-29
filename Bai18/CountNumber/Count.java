package Bai18.CountNumber;

public class Count implements Runnable{

    private Thread myThread;
    public Count() {
        myThread = new Thread(this, "My runnable thread");
        System.out.println("My thread created" + myThread);
        myThread.start();
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count " + i);
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("My thread run is over");
    }
}
