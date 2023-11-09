package leet_code.java;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams49 {
    public static void main(String[] args) {
//        Input: strs = ["eat","tea","tan","ate","nat","bat"]
//        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> lists = groupAnagrams(strs);
        System.out.println(lists);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<char[]> chara = Arrays.stream(strs).map(String::toCharArray).toList();
        chara.forEach(Arrays::sort);
        List<String> sorted = chara.stream().map(Arrays::toString).toList();
        Map<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            List<String> list = map.getOrDefault(sorted.get(i), new ArrayList<>());
            list.add(strs[i]);
            map.put(sorted.get(i), list);
        }
        return new ArrayList<>(map.values());
    }
}
