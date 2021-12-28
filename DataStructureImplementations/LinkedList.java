import java.io.*;

public class LinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;

        } else {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    public Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }

    public Node insertAtNthPosition(Node head, int data, int n) {
    // assuming n is always a valid position in linked list
        Node newNode = new Node(data);
        if (n == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            int i = 1;
            while (i < n-1) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head;
    }

    public void printList(Node head) {
        Node temp = head;
        while(temp != null ) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void printReverse(Node n) {
        if(n == null){
            return;
        }
        printReverse(n.next);
        System.out.println(n.data);
    }

    public Node deleteFromHead(Node head) {
        head = head.next;
        return head;
    }

    public Node deleteFromEnd(Node head) {
        Node temp = head;
        if(head == null || head.next == null) {
           head = null;
           return head;
        }
        while(temp.next.next != null) {
           temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public Node deleteFromNthPosition(Node head, int n) {
        if(head == null || head.next == null) {
           head = null;
        } else if (n == 1) {
            head = head.next;
        } else {
            Node temp = head;
            int i = 1;
            while (i < n-1) {
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Node head = null;

        head = ll.insertAtHead(head, 5);
        head = ll.insertAtHead(head, 3);
        head = ll.insertAtHead(head, 2);
        head = ll.insertAtNthPosition(head, 1, 1);
        head = ll.insertAtNthPosition(head, 4, 4);
        head = ll.insertAtEnd(head, 6);
        head = ll.insertAtEnd(head, 8);
        System.out.println("Printing the list: ");
        ll.printList(head); // 1 2 3 4 5 6 8
        System.out.println("Printing the list in reverse: ");
        ll.printReverse(head); // 8 6 5 4 3 2 1
        head = ll.deleteFromHead(head);
        head = ll.deleteFromEnd(head);
        System.out.println("Printing the list: ");
        ll.printList(head); // 2 3 4 5 6
        head = ll.deleteFromNthPosition(head, 3);
        System.out.println("Printing the list: ");
        ll.printList(head); // 2 3 5 6
    }
}