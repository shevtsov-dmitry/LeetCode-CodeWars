
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

    /*Example 2:

    Input: number = "1231", digit = "1"
    Output: "231"
    Explanation: We can remove the first '1' to get "231" or remove the second '1' to get "123".
    Since 231 > 123, we return "231".*/

public void main(String[] args) {
    removeDigit("43553327", '3');
}

public String removeDigit(String number, char digit) {
    List<String> list = new ArrayList<>();
    for (int i = 0; i < number.length(); i++) {
        if (number.charAt(i) == digit) {
            StringBuilder sb = new StringBuilder(number);
            sb.deleteCharAt(i);
            list.add(sb.toString());
        }
    }

    String highest = list.get(0);

    if (list.size() < 2)
        return highest;

    for (int i = 0; i < list.size() - 1; i++) {
        var first = new BigInteger(list.get(i));
        var sec = new BigInteger(list.get(i + 1));
        if (first != sec) {
            highest = first.max(sec).toString();
        }

    }
//        "4553327"
    System.out.println("list = " + list);
    System.out.println("highest = " + highest);
    return highest;
}
