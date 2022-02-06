public class StackLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;
    StackLL() {
        top = null;
    }

    public void isEmpty() {
        if(top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

    public void top() {
        if(top == null) {
            System.out.println("Error: Stack is empty");
        } else {
           System.out.println("Top is " + top.data);
        }
    }

    public void push(int data) {
        Node temp = new Node(data);
        System.out.println("Pusing in " + data);
        if (top == null) {
            top = temp;
        } else {
            temp.next = top;
            top = temp;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("Error: No element to pop");
        } else {
            System.out.println("Popping out " + top.data);
            top = top.next;
        }
    }

    public void printStackLL() {
        if (top == null) {
            System.out.println("Error: No element to print");
        } else {
            Node temp = top;
            System.out.println("Printing values in stack");
            while(temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String args[]) {
        StackLL sll = new StackLL();

        sll.printStackLL(); // Error: No element to print
        sll.pop(); // Error: No element to pop
        sll.top(); // Error: Stack is empty
        sll.isEmpty(); // Stack is empty
        sll.push(2); // Pusing in 2
        sll.push(4); // Pusing in 4
        sll.pop(); // Popping out 4
        sll.top(); // Top is 2
        sll.isEmpty(); // Stack is not empty
        sll.push(6); // Pusing in 6
        sll.printStackLL(); // Printing values in stack 6 2
        sll.pop(); // Popping out 6
        sll.pop(); // Popping out 2
        sll.isEmpty(); // Stack is empty

    }
}