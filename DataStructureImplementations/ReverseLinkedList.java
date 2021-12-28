public class ReverseLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public Node insert(Node head, int data) {
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

    public void printList(Node head) {
        Node temp = head;
        while(temp != null ) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = head;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public Node reverseWithRecursion(Node n) {
        if(n == null) {
            return n;
        }
        if(n.next == null) {
            return n;
        }
        Node newHead = reverseWithRecursion(n.next);
        n.next.next = n;
        n.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ReverseLinkedList ll = new ReverseLinkedList();
        Node head = null;

        head = ll.insert(head, 1);
        head = ll.insert(head, 2);
        head = ll.insert(head, 3);
        head = ll.insert(head, 4);
        head = ll.insert(head, 5);
        System.out.println("Printing the list: ");
        ll.printList(head); // 1 2 3 4 5
        head = ll.reverseList(head);
        System.out.println("Printing the list in reverse order: ");
        ll.printList(head); // 5 4 3 2 1
        head = ll.reverseWithRecursion(head);
        System.out.println("Printing the list in reverse order: ");
        ll.printList(head); // 1 2 3 4 5
    }

}