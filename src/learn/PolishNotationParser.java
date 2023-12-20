import java.util.Stack;

void main() {
    log();
}

void test() {
    String ex0 = parseToPolishNotation(" 3+5×23+5×2");
    assert ex0 == "+3×52+3×52" : STR."Actual: \{ex0} | Polish Notation: +3×52+3×52";
    String ex1 = parseToPolishNotation("(4−2)×(7+1)×(4−2)×(7+1)");
    assert ex1 == "×−42+71×−42+71" : STR."Actual: \{ex1} | Polish Notation: ×−42+71×−42+71";
    String ex2 = parseToPolishNotation("2×(8+3)−72×(8+3)−7");
    assert ex2 == "−×2+837−×2+837":STR."Actual: \{ex2} | Polish Notation: −×2+837−×2+837";
    String ex3 = parseToPolishNotation("(6+2)÷(4−1)×(6+2)÷(4−1)");
    assert ex3 == "÷+62−41÷+62−41":STR."Actual: \{ex3} | Polish Notation: /+62−41/+62−41";
    String ex4 = parseToPolishNotation("2+4×(9−5)×2+4×(9−5)");
    assert ex4 == "+2×4−95+2×4−95":STR."Actual: \{ex4} | Polish Notation: +2×4−95+2×4−95";
    String ex5 = parseToPolishNotation("3×((7+2)÷3)×3×((7+2)÷3)");
    assert ex5 == "×3÷+723×3÷+723" : STR."Actual: \{ex5} | Polish Notation: ×3÷+723×3÷+723";
    String ex6 = parseToPolishNotation("5×(2−1)+45×(2−1)+4");
    assert ex6 == "+×5−214+×5−214":STR."Actual: \{ex6} | Polish Notation: +×5−214+×5−214";
    String ex7 = parseToPolishNotation("(3+1)÷(2×4)×(3+1)÷(2×4)");
    assert ex7 == "÷+31×24÷+31×24":STR."Actual: \{ex7} | Polish Notation: ÷+31×24÷+31×24";
    String ex8 = parseToPolishNotation("4−(2×3)+54−(2×3)+5");
    assert ex8 == "+−4×235+−4×235":STR."Actual: \{ex8} | Polish Notation: +−4×235+−4×235";
    String ex9 = parseToPolishNotation("6÷(2+1)−4×26÷(2+1)−4×2");
    assert ex9 == "−÷6+21×42−÷6+21×42":STR."Actual: \{ex9} | Polish Notation: −÷6+21×42−÷6+21×42";
}

void log() {
    String ex0 = parseToPolishNotation(" 3+5×23+5×2");
    System.out.println(STR."Actual: \{ex0} | Polish Notation: +3×52+3×52");
    String ex1 = parseToPolishNotation("(4−2)×(7+1)×(4−2)×(7+1)");
    System.out.println(STR."Actual: \{ex1} | Polish Notation: ×−42+71×−42+71");
    String ex2 = parseToPolishNotation("2×(8+3)−72×(8+3)−7");
    System.out.println(STR."Actual: \{ex2} | Polish Notation: −×2+837−×2+837");
    String ex3 = parseToPolishNotation("(6+2)÷(4−1)×(6+2)÷(4−1)");
    System.out.println(STR."Actual: \{ex3} | Polish Notation: /+62−41/+62−41");
    String ex4 = parseToPolishNotation("2+4×(9−5)×2+4×(9−5)");
    System.out.println(STR."Actual: \{ex4} | Polish Notation: +2×4−95+2×4−95");
    String ex5 = parseToPolishNotation("3×((7+2)÷3)×3×((7+2)÷3)");
    System.out.println(STR."Actual: \{ex5} | Polish Notation: ×3÷+723×3÷+723");
    String ex6 = parseToPolishNotation("5×(2−1)+45×(2−1)+4");
    System.out.println(STR."Actual: \{ex6} | Polish Notation: +×5−214+×5−214");
    String ex7 = parseToPolishNotation("(3+1)÷(2×4)×(3+1)÷(2×4)");
    System.out.println(STR."Actual: \{ex7} | Polish Notation: ÷+31×24÷+31×24");
    String ex8 = parseToPolishNotation("4−(2×3)+54−(2×3)+5");
    System.out.println(STR."Actual: \{ex8} | Polish Notation: +−4×235+−4×235");
    String ex9 = parseToPolishNotation("6÷(2+1)−4×26÷(2+1)−4×2");
    System.out.println(STR."Actual: \{ex9} | Polish Notation: −÷6+21×42−÷6+21×42");
}

String parseToPolishNotation(String expression) {
    Stack<Character> stack = new Stack<>();
    final var polishNotation = new StringBuilder();
    final var tempo = new StringBuilder();
    for (char ch : expression.toCharArray()) {
        if (Character.isDigit(ch)) {
            polishNotation.append(ch);
        } else if (ch == ')') {
            while (true) {
                char cur = stack.pop();
                if (cur == '(') {
                    break;
                }
                polishNotation.append(cur);
            }
        } else if (!stack.isEmpty() && ( ch == '+' || ch == '-' || ch == '÷' || ch == '×' ) &&
                defineOperatorHierarchy(ch) >= defineOperatorHierarchy(stack.peek())) {
            polishNotation.append(stack.pop());
        } else {
            stack.push(ch);
        }
    }
//    return reverse(polishNotation.toString());
    return polishNotation.toString();
}

String reverse(String text) {
    var sb = new StringBuilder(text.length());
    for (int i = text.length() - 1; i >= 0; i--) {
        sb.append(text.charAt(i));
    }
    return sb.toString();
}

int defineOperatorHierarchy(char operator) {
    switch (operator) {
        case '×', '÷' -> {
            return 1;
        }
        case '-', '+' -> {
            return 2;
        }
    }
    return Integer.MAX_VALUE;
}
