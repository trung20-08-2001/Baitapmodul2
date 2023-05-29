package BTSlack.Day29_5_2023.Chieu.Bai5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    private static List<String> stringList;
    // Tìm chuỗi con phổ biến nhất
    // Viết một chương trình để tìm và hiển thị chuỗi con phổ biến nhất
    // trong một danh sách các chuỗi. Đầu vào là một danh sách các chuỗi
    // từ người dùng và chương trình sẽ tìm và hiển thị chuỗi con xuất hiện
    // nhiều nhất trong danh sách đó.


    public static String findTheMostCommonSubstring(List<String> stringList) {
        String mostCommonSubstring = "";
        int count = 0;
        Map<String, Integer> substringCount = new HashMap<>();
        for (String s : stringList) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    String currentSubstring = s.substring(i, j);
                    for (String str : stringList) {
                        if (str.indexOf(currentSubstring) != -1 && currentSubstring.length() > mostCommonSubstring.length()) {
                            int currentCount = substringCount.getOrDefault(currentSubstring, 0) + 1;
                            substringCount.put(currentSubstring, currentCount);
                            if (currentCount > count) {
                                count = currentCount;
                                mostCommonSubstring = currentSubstring;
                            }
                        }
                    }
                }
            }
        }
        return mostCommonSubstring;
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("abcdefghijk");
        stringList.add("defghijklmn");
        stringList.add("ghijklmnopq");
        System.out.println(findTheMostCommonSubstring(stringList));
    }

}
