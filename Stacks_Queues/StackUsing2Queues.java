import java.util.*;

public class StackUsing2Queues {
    static Queue<Integer> q1 = new LinkedList<Integer>();
    static Queue<Integer> q2 = new LinkedList<Integer>();
    public static void main(String args[]) {
        System.out.println("Costly pop operation");
        pop1();
        push1(1);
        push1(2);
        push1(3);
        pop1();
        push1(4);
        pop1();
        pop1();
        pop1();

        System.out.println("Costly push operation");
        pop2();
        push2(1);
        push2(2);
        push2(3);
        pop2();
        push2(4);
        pop2();
        pop2();
        pop2();

    }

    static void push1(int val) {
        q1.add(val);
    }

    static void pop1() {
        if (q1.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        while(q1.size() != 1) {
            q2.add(q1.remove());
        }

        System.out.println(q1.remove());

        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    static void push2(int val) {
        while(!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        q1.add(val);

        while(!q2.isEmpty()) {
            q1.add(q2.remove());
        }
    }

    static void pop2() {
        if (q1.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
       System.out.println(q1.remove());
    }
    
}
