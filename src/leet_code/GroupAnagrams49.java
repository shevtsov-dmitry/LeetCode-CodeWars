import java.util.*;

void main() {
//    Input: strs = ["eat","tea","tan","ate","nat","bat"]
//    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    String[] strings = {"eat","tea","tan","ate","nat","bat"};
    groupAnagrams(strings);
}

public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    StringBuilder stringBuilder = new StringBuilder();
    for (String str : strs) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        for (char c : charArray) {
            stringBuilder.append(c);
        }
        List<String> list = map.getOrDefault(stringBuilder.toString(), new ArrayList<>());
        list.add(str);
        map.put(stringBuilder.toString(), list);
        stringBuilder.delete(0, stringBuilder.length());
    }
    List<List<String>> answer = new ArrayList<>();
    for (Map.Entry<String, List<String>> kv : map.entrySet()) {
        List<String> value = kv.getValue();
        answer.add(value);
    }
    return answer;
}