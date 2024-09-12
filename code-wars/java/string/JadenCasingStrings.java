import java.util.Arrays;
import java.util.stream.Collectors;

void main() {
//		Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
//     Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
    toJadenCase("How can mirrors be real if our eyes aren't real");
}

public String toJadenCase(String phrase) {
    var list = Arrays.stream(phrase.split(" ")).map(e -> e = String.valueOf(phrase.charAt(0)).toUpperCase() + e.substring(1)).toList();

    var sb = new StringBuilder();
    for (String string : list) {
        sb.append(string);
    }

    return sb.toString();
}
