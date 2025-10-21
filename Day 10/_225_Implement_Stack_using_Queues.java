import java.util.LinkedList;
import java.util.Queue;

public class _225_Implement_Stack_using_Queues {
    class MyStack {

    Queue<Integer> queue = new LinkedList<>();

    public MyStack() {
    }

    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        while (size-- > 1) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

    
}
