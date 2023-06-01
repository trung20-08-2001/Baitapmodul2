package Bai19.CrawlSong;

import javax.print.DocFlavor;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try{
            URL url=new URL("https://www.nhaccuatui.com/playlist/top-100-pop-usuk-hay-nhat-va.zE23R7bc8e9X.html");
            Scanner scanner=new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content=scanner.next();
            scanner.close();
            content=content.replaceAll("\\n+","");
            System.out.println(content);
            Pattern pattern= Pattern.compile("name_song\">(.*?)</a>");
            Matcher matcher=pattern.matcher(content);
            int count=1;
            System.out.println("Top 100 song: ");
            while (matcher.find()&&count<=100){
                System.out.println(count+". "+matcher.group(1));
                count++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

