package BTSlack.Day29_5_2023.Chieu.Bai4;

import java.util.ArrayList;
import java.util.List;

public class Test {
    //Tìm chuỗi con lặp lại dài nhất
    //Viết một chương trình để tìm và hiển thị chuỗi con lặp lại dài nhất trong một chuỗi.
    // Đầu vào là một chuỗi từ người dùng và chương trình sẽ tìm và
    // hiển thị chuỗi con lặp lại dài nhất trong chuỗi đó.


    public static String findTheLongestRepeatingSubstring(String str) {
        String longestRepeatingSubstring = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String currentSubstring = str.substring(i, j);
                if (str.indexOf(currentSubstring, j) != -1 && currentSubstring.length() > longestRepeatingSubstring.length()) {
                    longestRepeatingSubstring = currentSubstring;
                }
            }
        }
        if (longestRepeatingSubstring.length() == 0) {
            return "No repeating substring";
        } else {
            return longestRepeatingSubstring;
        }
    }

    public static void main(String[] args) {
        System.out.println(findTheLongestRepeatingSubstring("asdfkuiyasdfkuiyasd"));
    }
}
