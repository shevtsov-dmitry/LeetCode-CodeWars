import java.util.LinkedList;
import java.util.List;

void main() {
    generateParenthesis(3);
}

public List<String> generateParenthesis(int n) {
    List<String> result = new LinkedList<>();
    findAvailablePairs(result, "", 0, 0, n);
    System.out.println(STR."result = \{result}");
    return result;
}

public void findAvailablePairs(List<String> list, String str, int open, int close, int max) {
    if (str.length() == max * 2) {
        list.add(str);
        return;
    }
    if (open < max)
        findAvailablePairs(list, str.concat("("), open + 1, close, max);
    if (close < open)
        findAvailablePairs(list, str.concat(")"), open, close + 1, max);
}

