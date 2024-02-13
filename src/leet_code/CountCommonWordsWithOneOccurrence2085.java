import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

void main() {
    String[] arr = {"a","aa","aaa"}; // {"leetcode","is","amazing","as","is"};
    String[] arr2 = {"b","bb","bbb"}; // {"amazing","leetcode","is"};


    int i = countWords(arr, arr2);
    System.out.println(i);
}

public int countWords(String[] words1, String[] words2) {
    Map<String, Integer> map1 = new HashMap<>(words1.length);
    Map<String, Integer> map2 = new HashMap<>(words2.length);
    Arrays.stream(words1).forEach(e -> map1.put(e, map1.getOrDefault(e, 0)+1));
    Arrays.stream(words2).forEach(e -> map2.put(e, map2.getOrDefault(e, 0)+1));

    int answer = 0;
    for (Map.Entry<String, Integer> stringIntegerEntry : map2.entrySet()) {
        String key = stringIntegerEntry.getKey();
        Integer value = stringIntegerEntry.getValue();
        if(value == 1 && map1.getOrDefault(key, 0) == 1){
            answer++;
        }
    }
    return answer;
}