package Bai18.TaoThread;

public class Test {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1=new NumberGenerator("Thread1");
        NumberGenerator numberGenerator2=new NumberGenerator("Thread2");
        Thread thread1=new Thread(numberGenerator1);
        Thread thread2=new Thread(numberGenerator2);
        thread1.setPriority(1);
        thread2.setPriority(6);
        thread1.start();
        thread2.start();

    }
}
