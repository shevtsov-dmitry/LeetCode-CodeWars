import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

void main() {
    String s = "CONTEST IS COMING";
//    String s = "HOW ARE YOU";
    List<String> strings = printVertically(s);
    System.out.println(strings);
}

public List<String> printVertically(String s) {
    String[] split = s.split(" ");
    int maxLength = Arrays.stream(split).mapToInt(String::length).max().orElse(0);
    List<String> answer = new ArrayList<>(maxLength);
    for (int i = 0; i < maxLength; i++) {
        answer.add("");
    }
    for (String word : split) {
        char[] charArray = word.toCharArray();
        int i = 0;
        while (i < charArray.length) {
            String c = String.valueOf(charArray[i]);
            answer.set(i, answer.get(i).concat(c));
            i++;
        }
        if (word.length() != maxLength) {
            while (i < maxLength) {
                answer.set(i, answer.get(i).concat(" "));
                i++;
            }
        }
    }

    for (int i = 0; i < answer.size(); i++) {
        String string = answer.get(i);
        if (string.charAt(string.length() - 1) == ' ') {
            StringBuilder sb = new StringBuilder(string);
            while (sb.charAt(sb.length() - 1) == ' ' && !sb.isEmpty()) {
                sb.deleteCharAt(sb.length() - 1);
            }
            answer.set(i, sb.toString());
        }
    }

    return answer;
}