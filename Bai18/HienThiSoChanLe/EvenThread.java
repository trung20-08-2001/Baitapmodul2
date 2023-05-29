package Bai18.HienThiSoChanLe;

public class EvenThread implements Runnable{
    @Override
    public void run() {
        try{
            for(int i=0;i<10;i+=2){
                System.out.println("Print the number: "+i);
                Thread.sleep(15);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
