import java.util.HashMap;
import java.util.Map;

void main(){
//    compress(new char[]{'a','a','b','b','c','c','c'});
    compress(new char[]{'a'});
}

public int compress(char[] chars) {
	Map<Character, Integer> map = new HashMap<>();
    var sb = new StringBuilder();
    for (char c : chars) {
		map.put(c, map.getOrDefault(c, 0) + 1);
    }
    for(var mapEntry : map.entrySet()) {
        char k = mapEntry.getKey();
        int v = mapEntry.getValue();
        sb.append(k).append(v);
    }
    int i = 0;
    for (char c : sb.toString().toCharArray()) {
        if (i > chars.length - 1) break;
        chars[i] = c;
        i++;
    }
    return sb.length();
}
