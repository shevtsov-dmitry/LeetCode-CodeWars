import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

void main() {
    // Input: strs = ["eat","tea","tan","ate","nat","bat"]
    // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    final var answer = groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
}

List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    Arrays.stream(strs)
        .forEach(anagram -> {
            String strIntId = anagram.chars()
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

            // System.out.printf("%s = %s%n", anagram, strIntId);
            List<String> anagrams = map.getOrDefault(strIntId, new ArrayList<String>());
            anagrams.add(anagram);
            map.put(strIntId, anagrams);
        });

    return map.values().stream().collect(Collectors.toList());

}
