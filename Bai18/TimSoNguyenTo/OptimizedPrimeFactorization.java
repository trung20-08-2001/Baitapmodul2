package Bai18.TimSoNguyenTo;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        for(int i=2;i<10;i++) {
            boolean check = true;
            for (int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    check=false;
                    break;
                }
            }
            if(check){
                System.out.println("OptimizedPrimeFactorization "+i);
            }
        }
    }
}
