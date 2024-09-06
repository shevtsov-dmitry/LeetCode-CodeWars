import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

void main( ) {

    System.out.println();
}

boolean isAnagram(String s, String t) {
    Set<Integer> set = new HashSet<>(s.length());
    t.chars().forEach(set::add);

    for (char ch : s.toCharArray()) {
        if (!set.contains((int) ch)) {
            return false;
        }
    }

    return true;
}
