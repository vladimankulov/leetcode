import java.util.Deque;
import java.util.LinkedList;

public class MyStack {

    private Deque<Integer> stack;
    public MyStack() {
        stack = new LinkedList();
    }

    public void push(int x) {
        stack.addLast(x);
    }

    public int pop() {
       return stack.removeLast();
    }

    public int top() {
        return stack.getLast();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
