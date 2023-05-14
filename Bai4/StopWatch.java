package Bai4;

import java.util.Arrays;
import java.util.Date;

public class StopWatch {
    private long startTime, endTime;

    public long getStartTime() {
        Date date = new Date();
        this.startTime = date.getTime();
        return startTime;
    }

    public long getEndTime() {
        Date date = new Date();
        this.endTime = date.getTime();
        return endTime;
    }

    public void getElapsedTime() {
        System.out.println("Thời gian thực thi thuật toán: " + (this.endTime - this.startTime) + " (milisecond).");
    }
}

class run {
    public static int[] selectionSort() {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        time.getStartTime();
        selectionSort();
        time.getEndTime();
        time.getElapsedTime();
    }
}
