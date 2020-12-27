import java.util.*;

public class StackUsing1Queue {
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String args[]) {
        System.out.println("Stack using single Queue");
        pop();
        push(1);
        push(2);
        push(3);
        pop();
        push(4);
        pop();
        pop();
        pop();
    }

    static void push(int val) {
        int size = q.size();
        q.add(val);
        for (int i=0; i<size; i++) {
            q.add(q.remove());
        }
    }
    
    static void pop() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(q.remove());
    }
}
