package Bai18.HienThiSoChanLe;

public class OddThread implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 1; i < 10; i += 2) {
                System.out.println("Print the number " + i);
                Thread.sleep(10);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
