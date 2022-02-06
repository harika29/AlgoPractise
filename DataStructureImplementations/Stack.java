public class Stack() {
    int top;
    int[] a;
    Stack() {
        this.top = -1;
        a = new int[10];
    }

    public void push(int i) {
        if (top == (a.length - 1)) {
            // we can double the array and move elements to new array with double the length
            System.out.println("Error: Stack overflow");
        }
        System.out.println("Pusing in " + i);
        a[++top] = i;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Error: No element to pop");
        } else {
            System.out.println("Popping out " + a[top]);
            top--;
        }
    }

    public void top() {
        if(top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top is " + a[top]);
        }
    }

    public void isEmpty() {
        if(top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

    public void printStack() {
        if(top == -1) {
            System.out.println("Stack is empty");
        } else {
             System.out.println("Printing values in stack");
             for(int i = top; i>=0; i--) {
                System.out.println(a[i]);
             }
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.isEmpty(); // Stack is empty
        s.push(2); // Pusing in 2
        s.push(4); // Pusing in 4
        s.pop(); // Popping out 4
        s.top(); // Top is 2
        s.isEmpty(); // Stack is not empty
        s.push(6); // Pusing in 6
        s.printStack(); // Printing values in stack 6 2
        s.pop(); // Popping out 6
        s.pop(); // Popping out 2
        s.isEmpty(); // Stack is empty
    }
}