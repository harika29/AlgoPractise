public class DoublyLL {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    public Node inserAtHead(Node head, int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    public void print(Node head) {
        while(head != null) {
             System.out.println(head.data);
             head = head.next;
        }
    }

    public void reversePrint(Node head) {
        if(head == null) return;
        while(head.next != null) {
            head = head.next;
        }
        while(head != null) {
             System.out.println(head.data);
             head = head.prev;
        }
    }


    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        Node head = null;

        head = dll.inserAtHead(head, 4);
        head = dll.inserAtHead(head, 3);
        head = dll.inserAtHead(head, 2);
        head = dll.inserAtHead(head, 1);
        System.out.println("Forward print :");
        dll.print(head);
        System.out.println("Reverse print :");
        dll.reversePrint(head);
    }
}