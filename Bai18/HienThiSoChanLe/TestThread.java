package Bai18.HienThiSoChanLe;

public class TestThread {
    public static void main(String[] args) {
        EvenThread evenThread=new EvenThread();
        OddThread oddThread=new OddThread();
        Thread thread0=new Thread(evenThread);
        Thread thread1=new Thread(oddThread);
        thread1.start();
        try{
            thread1.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        thread0.start();
    }
}