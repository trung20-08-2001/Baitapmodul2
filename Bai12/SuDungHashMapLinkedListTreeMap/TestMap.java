package Bai12.SuDungHashMapLinkedListTreeMap;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(hashMap);
        hashMap.put( 12,"D");
        hashMap.put( 15,"R");
        hashMap.put(21,"T");
        hashMap.put(23,"Y");
        hashMap.put( 30,"P");
        hashMap.put(19,"O");
        System.out.println("--------HASH MAP------------");
        for(Integer key:hashMap.keySet()){
            System.out.println(hashMap.get(key)+" có tuổi là: "+key);
        }
        treeMap.putAll(hashMap);
        System.out.println("---------TREE MAP-----------");
        for(Integer key :treeMap.keySet()){
            System.out.println(treeMap.get(key)+" có tuổi là: "+key);
        }
        System.out.println("--------LINKED HASHMAP---------");
        linkedHashMap.putAll(hashMap);
        for(Integer key: linkedHashMap.keySet()){
            System.out.println(linkedHashMap.get(key)+" có tuổi là: "+key);
        }
    }
}
