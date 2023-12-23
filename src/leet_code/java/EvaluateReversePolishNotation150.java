import java.util.Arrays;
import java.util.Stack;

void main() {
    String[] t1 = {"2","1","+","3","*"};
    String[] t2 = {"4","13","5","/","+"};
    String[] t3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
    test(t1, t2, t3);
}


public int evalRPN(String[] tokens) {
    final Stack<Integer> numsStack = new Stack<>();
   for (final String token : tokens) {
       if (token == "*" || token == "/" || token == "+" || token == "-") {
            final int operand2 = numsStack.pop();
            final int operand1 = numsStack.pop();
            final String operator = token;
            final int counted = count(operand1, operator, operand2);
            numsStack.push(counted);
        } else {
            numsStack.push(Integer.parseInt(token));
        }
    }
    return numsStack.peek();
}

public int count(int first, String cur, int sec) {
    switch (cur) {
        case "-" -> {
            return first - sec;
        }
        case "+" -> {
            return first + sec;
        }
        case "*" -> {
            return first * sec;
        }
        case "/" -> {
            return first / sec;
        }
        default -> {
            return 0;
        }
    }
}
void test(String[] t1, String[] t2, String[] t3) {
    int a1 = evalRPN(t1);
    int a2 = evalRPN(t2);
    int a3 = evalRPN(t3);
    assert a1 == 9 : STR."expected: 9 | actual: \{a1} | for \{Arrays.toString(t1)}";
    assert a2 == 6 : STR."expected: 6 | actual: \{a2} | for \{Arrays.toString(t2)}";
    assert a3 == 22 : STR."expected: 22 | actual: \{a2} | for \{Arrays.toString(t3)}";
}
