package BTSlack.Day29_5_2023.Chieu.Bai3;

public class Test {
    //Kiểm tra xem hai chuỗi có phải là anagram hay không
    //Viết một chương trình để kiểm tra xem hai chuỗi có
    // phải là anagram hay không. Hai chuỗi là anagram nếu
    // chúng có cùng các ký tự, nhưng chỉ khác vị trí của các ký tự đó.
    // Đầu vào là hai chuỗi từ người dùng và chương trình sẽ kiểm tra và hiển thị kết quả.

    public static boolean isAnagramString(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] countStr1 = new int[str1.length()];
        int[] countStr2 = new int[str1.length()];
        int sum = 0;
        for (int i = 0; i < str1.length(); i++) {
            countStr1[i] = (int) str1.charAt(i);
            countStr2[i] = (int) str2.charAt(i);
        }
        for (int i = 0; i < countStr1.length; i++) {
            for (int j = 0; j < countStr2.length; j++) {
                if (countStr1[i] == countStr2[j]) {
                    countStr1[i] = -1;
                    countStr2[j] = -1;
                }
            }
        }
        for (int i = 0; i < countStr1.length; i++) {
            sum += countStr1[i];
        }
        if(sum==-str1.length()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagramString("aiokuio","uoikoia"));
        System.out.println(isAnagramString("aiokkuio","uoikomia"));
    }
}
