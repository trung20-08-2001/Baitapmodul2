package Bai11.DungMapDemSoLanXuatHienCuaPhanTu;

import java.util.TreeMap;

public class Map {
    public TreeMap wordsCount(String str){
        TreeMap<Character,Integer> wordCount=new TreeMap<>();
        Character[] words= new Character[str.length()];
        for(int i=0;i<str.length();i++){
            words[i]=str.charAt(i);
        }
        for(Character character:words){
            if(!wordCount.containsKey(character)){
                wordCount.put(character,1);
            }else{
                int count=wordCount.get(character);
                wordCount.put(character,count+1);
            }

        }
        return wordCount;
    }
}
