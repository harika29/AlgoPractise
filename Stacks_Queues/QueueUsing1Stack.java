import java.util.*;

public class QueueUsing1Stack {
    static Stack<Integer> stack = new Stack<Integer>();

    public static void main(String[] args) {
        dequeue();
        enqueue(1);
        enqueue(2);
        enqueue(3);
        dequeue();
        enqueue(4);
        dequeue();
        dequeue();
        dequeue();
        dequeue();
    }

    static void enqueue(int val) {
        stack.push(val);
    }

    static void dequeue() {
        int result = recurse();
        if (result != -1)
            System.out.println(result);
    }

    static int recurse() {
        if (stack.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if (stack.size() == 1) {
            return stack.pop();
        }
        int curr_val = stack.pop();
        int result = recurse();
        stack.push(curr_val);
        return result;
    }

}
