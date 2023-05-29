package Bai18.TimSoNguyenTo;

public class Test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new OptimizedPrimeFactorization());
        Thread thread2 = new Thread(new LazyPrimeFactorization());
        thread2.start();
        thread1.start();
    }
}
