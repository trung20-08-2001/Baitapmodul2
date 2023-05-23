package Bai14.CaiDatThuatToanSapXepNoiBot;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int a=0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        int[] arr={2,45,8,56,12,6,23,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
