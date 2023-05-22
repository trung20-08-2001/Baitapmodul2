package Bai13.TimKiemNhiPhanKhongDungDeQuy;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int number = 78;
        int index = checkNumber(number, list);
        if (index>=0){
            System.out.println(number+" ở vị trí "+index);
        }else{
            System.out.println(number+" không có trong mảng.");
        }
    }


    public static int checkNumber(int number,int[] arr){
        int head=0;
        int last=arr.length-1;
        while(head<=last){
            int mid=(head+last)/2;
            if(arr[mid]==number){
                return mid;
            } else if (arr[mid]>number) {
                last=mid-1;
            }else {
                head=mid+1;
            }
        }
        return -1;
    }

}
