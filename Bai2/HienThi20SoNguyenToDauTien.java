package Bai2;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên:");
        byte count=0;
        for(byte i=2;count <20;i++){
            boolean check=true;
            for( byte j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    check=false;
                    break;
                }
            }
            if(check){
                count++;
                System.out.print(i+" ");
            }
        }
    }
}
