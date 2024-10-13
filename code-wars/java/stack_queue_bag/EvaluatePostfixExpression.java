import java.util.Stack;

void main(){
    long ans = evaluate("3 5 7 4 - 2 ^ * +");
    assert ans == 48  : STR."expected: 48 | actual \{ans}";
}
long evaluate(String s) {
    final Stack<Long> stack = new Stack<>();
    for(char ch : s.toCharArray()){
        if(ch == ' ') continue;
        if(Character.isDigit(ch)) {
            stack.push(Long.parseLong(String.valueOf(ch)));
        } else {
            long first = stack.pop();
            long sec = stack.pop();
            long res = 0;
            switch (ch){
                case '+' -> res = sec + first;
                case '^' -> res = (long) Math.pow(sec, first);
                case '-' -> res = sec - first;
                case '*' -> res = sec * first;
                case '/' -> res = sec / first;
            }
            stack.push(res);
        }
    }
    return stack.pop();
}