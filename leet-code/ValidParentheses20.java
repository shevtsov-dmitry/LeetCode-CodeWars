import java.util.LinkedList;
import java.util.Stack;

void main() {
}

public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (char currentChar : s.toCharArray()) {
        if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
            stack.push(currentChar);
        } else if (stack.isEmpty()) {
            return false;
        } else if (currentChar == ')' && stack.peek() == '('
                || currentChar == ']' && stack.peek() == '['
                || currentChar == '}' && stack.peek() == '{') {
            stack.pop();
        } else {
            return false;
        }

    }
    return stack.isEmpty();
}

// BACK TO IT THIRD TIME
public boolean isValid3(String parentheses) {
    if (parentheses.length() == 0 || parentheses.length() == 1)
        return false;

    char[] chars = parentheses.toCharArray();
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < chars.length; i++) {
        char par = chars[i];
        if (i == 0) {
            stack.push(par);
        } else if (par == ')' && stack.isEmpty() ||
                par == ']' && stack.isEmpty() ||
                par == '}' && stack.isEmpty()) {
            return false;
        } else if ((par == ')' && stack.peek() == '(')
                || (par == ']' && stack.peek() == '[')
                || (par == '}' && stack.peek() == '{')) {
            stack.pop();
        } else if (par == '(' || par == '[' || par == '{') {
            stack.push(par);
        } else
            return false;
    }
    return stack.isEmpty();
}

// ! OLD VERSION
public boolean isValidOld(String s) {
    var roundBrackets = new LinkedList<Character>();
    var squareBrackets = new LinkedList<Character>();
    var curlyBrackets = new LinkedList<Character>();
    // fill string builders with related brackets
    for (int i = 0; i < s.length(); i++) {
        switch (s.charAt(i)) {
            case '(', ')' -> roundBrackets.add(s.charAt(i));
            case '[', ']' -> squareBrackets.add(s.charAt(i));
            case '{', '}' -> curlyBrackets.add(s.charAt(i));
        }
    }
    System.out.println("roundBrackets: " + roundBrackets);
    System.out.println("curlyBrackets: " + curlyBrackets);
    System.out.println("squareBrackets: " + squareBrackets);
    // handle incompatible first letter exception
    if (curlyBrackets.isEmpty()) {
    } else if (curlyBrackets.get(0) == ')') return false;
    else {
    }
    if (roundBrackets.isEmpty()) {
    } else if (roundBrackets.get(0) == ')') return false;
    else {
    }
    if (squareBrackets.isEmpty()) {
    } else if (squareBrackets.get(0) == ')') return false;
    else {
    }
    // round
    int matchesRightRound = 0;
    int matchesLeftRound = 0;
    for (int i = 0; i < roundBrackets.size(); i++) {
        if (roundBrackets.get(i) == '(') {
            matchesLeftRound++;
            for (int j = i + 1; j < roundBrackets.size(); j++) {
                if (roundBrackets.get(j) == ')') {
                    roundBrackets.set(j, '!');
                    matchesRightRound++;
                }
                ;
            }
        }
    }
    boolean round = matchesLeftRound == matchesRightRound;
    // curly
    int matchesRightCurly = 0;
    int matchesLeftCurly = 0;
    for (int i = 0; i < curlyBrackets.size(); i++) {
        if (curlyBrackets.get(i) == '{') {
            matchesLeftCurly++;
            for (int j = i + 1; j < curlyBrackets.size(); j++) {
                if (curlyBrackets.get(j) == '}') {
                    curlyBrackets.set(j, '!');
                    matchesRightCurly++;
                }
                ;
            }
        }
    }
    boolean curly = matchesLeftCurly == matchesRightCurly;
    // square
    int matchesRightSquare = 0;
    int matchesLeftSquare = 0;
    for (int i = 0; i < squareBrackets.size(); i++) {
        if (squareBrackets.get(i) == '[') {
            matchesLeftSquare++;
            for (int j = i + 1; j < squareBrackets.size(); j++) {
                if (squareBrackets.get(j) == ']') {
                    squareBrackets.set(j, '!');
                    matchesRightSquare++;
                }
                ;
            }
        }
    }
    boolean square = matchesLeftSquare == matchesRightSquare;
    // log
    System.out.println("round\t L: " + matchesLeftRound + "\t R: " + matchesRightRound);
    System.out.println("curly\t L: " + matchesLeftCurly + "\t R: " + matchesRightCurly);
    System.out.println("square\t L: " + matchesLeftSquare + "\t R: " + matchesRightSquare);
    // return
    return round && curly && square;
}
