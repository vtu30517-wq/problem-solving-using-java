import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push element onto stack
    public void push(int x) {
        // Step 1: Add new element to q2
        q2.offer(x);

        // Step 2: Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        // Step 3: Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Removes and returns top element
    public int pop() {
        return q1.poll();
    }

    // Returns top element
    public int top() {
        return q1.peek();
    }

    // Returns true if empty
    public boolean empty() {
        return q1.isEmpty();
    }
}