package BTSlack.Day29_5_2023.Chieu.Bai2;

public class Test {
    //Chuỗi con tăng dần dài nhất
    //Viết một chương trình để tìm và hiển thị chuỗi con dài nhất trong một chuỗi,
    // sao cho chuỗi con đó là chuỗi các ký tự tăng dần theo thứ tự từ điển.
    // Đầu vào là một chuỗi từ người dùng và chương trình sẽ tìm và hiển thị
    // chuỗi con dài nhất thỏa điều kiện đã cho.

    public static String findLongestAscendingSubstring(String str) {
        String longestSubstring = "";
        String currentSubstring = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = i; j < str.length(); j++) {
                if (currentSubstring.isEmpty() || c > currentSubstring.charAt(currentSubstring.length() - 1)) {
                    currentSubstring += c;
                } else {
                    if (currentSubstring.length() > longestSubstring.length()) {
                        longestSubstring=currentSubstring;
                    }
                    currentSubstring=""+c;
                }
            }
            longestSubstring=currentSubstring;
        }
        return  longestSubstring;
    }

    public static void main(String[] args) {
        System.out.println(findLongestAscendingSubstring("asdtyuisrdytfjgkl"));
    }
}
