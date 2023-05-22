package Bai13.TinhDoPhucTapCuaThuatToan;

import java.util.ArrayList;
import java.util.Scanner;

public class AlgorithmComplexityTest {
    static public int[][] countCharacterInString(String str) {
        int[][] ints = new int[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < ints.length; j++) {
                if (str.charAt(i) == ints[j][0]) {
                    count += 1;
                }
            }
            ints[i][0] = str.charAt(i);
            ints[i][1] = count;
        }
        return ints;
    }

    static public int[] findMaxArray2D(int[][] ints) {
        int[] result=new int[2];
        int max = ints[0][1];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i][1] > max) {
                max = ints[i][1];
                result[0]=ints[i][0];
                result[1]=max;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi.");
        String str = scanner.nextLine();
        int[][] arr = countCharacterInString(str);
        int[] result = findMaxArray2D(arr);
        int asciiCode = result[0];
        char ch = (char) asciiCode;
        System.out.println("Kí tự " + ch + " xuất hiện nhiều nhất. " + result[1] + " lần.");
    }
}
