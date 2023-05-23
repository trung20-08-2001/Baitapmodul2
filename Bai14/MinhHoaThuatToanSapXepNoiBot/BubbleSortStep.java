package Bai14.MinhHoaThuatToanSapXepNoiBot;

public class BubbleSortStep {
    public static void bubbleSortByStep(int[] arr) {
        boolean needNextPass = true;
        for (int k = 1; k < arr.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < arr.length - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println("Swap " + arr[i] + " with " + arr[i + 1]);
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    needNextPass = true;
                }
            }
            if(!needNextPass){
                System.out.println("Sắp xếp xong.");
                break;
            }
            System.out.print("Sau khi sắp xếp " + k + " lần: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr={1,5,93,12,3,20,30};
        bubbleSortByStep(arr);
    }
}
