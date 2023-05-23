package Bai14.CaiDatThuaToanSapXepChon;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0;i< arr.length;i++){
            int currentMin=arr[i];
            int currentMinIndex=i;
            for (int j=i+1;j< arr.length;j++){
                if(currentMin> arr[j]){
                    currentMin=arr[j];
                    currentMinIndex=j;
                }
            }
            if(currentMinIndex!=i){
                arr[currentMinIndex]=arr[i];
                arr[i]=currentMin;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,9,23,56,74,19,36};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
