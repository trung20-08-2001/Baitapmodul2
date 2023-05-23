package Bai14.CaiDatThuatToanSapXepChen;

import java.util.Arrays;

public class InsertSort {
    public static void inertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int pos = i;
            int x = arr[i];
            while (pos > 0 && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos]=x;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,45,49,19,26,10,50};
        inertSort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
