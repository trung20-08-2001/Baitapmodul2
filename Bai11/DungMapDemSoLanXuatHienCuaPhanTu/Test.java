package Bai11.DungMapDemSoLanXuatHienCuaPhanTu;

import java.util.Scanner;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        while(true) {
            Map test = new Map();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập chuỗi:");
            String str = scanner.nextLine();
            TreeMap<Character, Integer> result = test.wordsCount(str);
            for (Character word : result.keySet()) {
                int count = result.get(word);
                System.out.println(word + " xuất hiện " + count+" lần.");
            }
        }
    }
}
