package Bai2;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100:");
        for (byte i=2; i<100;i++){
            boolean check=true;
            for(byte j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    check=false;
                }
            }
            if(check){
                System.out.print(i+" ");
            }
        }


    }

}
