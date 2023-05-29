package BTSlack.Day29_5_2023.Bai5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByDictionaryString {

    // Sắp xếp danh sách chuỗi theo thứ tự từ điển.
    public static List<String> sort(List<String> arrayString){
         Collections.sort(arrayString);
         return arrayString;
    }

    public static void main(String[] args) {
        List<String> arrayStr=new ArrayList<>();
        arrayStr.add("ok");
        arrayStr.add("banana");
        arrayStr.add("mango");
        arrayStr.add("origin");
        arrayStr.add("good");
        arrayStr.add("look");
        arrayStr.add("clap");
        System.out.println("Before :"+arrayStr);
        sort(arrayStr);
        System.out.println("After :" +arrayStr);
    }
}
