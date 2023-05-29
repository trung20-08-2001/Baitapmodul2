package Bai18.TaoThread;

public class NumberGenerator implements Runnable{

    private  String name;
    public NumberGenerator(String name){
        this.name=name;
    }
    @Override
    public void run() {
        try{
            for(int i=0;i<10;i++){
                System.out.println("HashCode of "+name+": "+Thread.currentThread().hashCode()+".Print the number: "+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
