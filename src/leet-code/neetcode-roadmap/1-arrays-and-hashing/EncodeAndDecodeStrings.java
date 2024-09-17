import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

void main() {
    List<String> initial = List.of("neet","code","love","you");
    String encoded = encode(initial);
    List<String> decoded = decode(encoded);
    assert initial.equals(decoded) : "Intiial %s | Decoded %s".formatted(initial, decoded);
}

final String DELIMER = "Ф";

public String encode(List<String> strs) {
    StringJoiner sj = new StringJoiner(DELIMER);
    strs.forEach(sj::add);
    return sj.toString();
}

public List<String> decode(String str) {
    String[] splitted = str.split(DELIMER);
    return Arrays.stream(splitted).map(String::toString).toList();
}
