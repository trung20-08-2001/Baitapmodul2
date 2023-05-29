package BTSlack.Day5_5_2023;

public class Bai5 {
    //. Viết chương trình để tính tổng của tất cả
    // các số nguyên tố có hai chữ số.
    public static void main(String[] args) {
        int sum=0;
        for(byte i=11;i<100;i++){
           int result = CheckSNT(i);
           if(result!=0){
               sum+=i;
           }
        }
        System.out.println("Tổng các số nguyên tố có hai chữ số là: "+sum);
    }


    

    public static int CheckSNT(int a) {
        boolean check=true;
        for(byte i=2;i<Math.sqrt(a);i++){
            if(a%i==0){
                check=false;
                break;
            }
        }
        if(check){
            return a;
        }
        return 0;
    }
}
