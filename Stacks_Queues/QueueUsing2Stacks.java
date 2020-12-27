import java.util.*;

public class QueueUsing2Stacks {
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();
    public static void main(String args[]){
        System.out.println("Costly dequeu operation");
        dequeue1();
        enqueue1(1);
        enqueue1(2);
        enqueue1(3);
        dequeue1();
        enqueue1(4);
        dequeue1();
        dequeue1();
        dequeue1();
        dequeue1();

        System.out.println("Costly Enqueue operation");
        dequeue2();
        enqueue2(1);
        enqueue2(2);
        enqueue2(3);
        dequeue2();
        enqueue2(4);
        dequeue2();
        dequeue2();
        dequeue2();
        dequeue2();
    }

    public static void enqueue1(int val) {
        stack1.push(val);
    }

    public static void dequeue1() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        if (stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        System.out.println(stack2.pop());
    }

    public static void enqueue2(int val) {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(val);

        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

    }

    public static void dequeue2() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(stack1.pop());
    }
    
}
