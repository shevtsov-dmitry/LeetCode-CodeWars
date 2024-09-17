import java.util.Stack;

void main() {
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    assert minStack.getMin() == -3 : "expected -3 | actual %d".formatted(minStack.getMin());
    minStack.pop();
    assert minStack.top() == 0 : "expected 0 | actual %d".formatted(minStack.top());
    assert minStack.getMin() == -2 : "expected -2 | actual %d".formatted(minStack.getMin());
}

class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else if (val < minStack.peek()) {
            minStack.push(val);
        } else {
            minStack.push(minStack.peek());
        }
        stack.push(val);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
