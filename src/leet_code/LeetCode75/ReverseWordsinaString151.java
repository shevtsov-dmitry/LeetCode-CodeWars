import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

void main() {
//    Input: s = "the sky is blue"
//    Output: "blue is sky the"
    reverseWords("the sky is blue");
}

public String reverseWords(String s) {
    s = s.trim();
    String[] words = s.split(" ");
    List<String> wordsList = new ArrayList<>(Arrays.stream(words).filter(string -> !string.isBlank()).toList());
    Collections.reverse(wordsList);
    return String.join(" ", wordsList);
}