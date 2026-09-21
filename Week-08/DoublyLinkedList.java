// Doubly Linked List Implementation in Java
// Operations: Insert at Head, Insert at Tail, Delete by Value, Display Forward & Backward

public class DoublyLinkedList {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    // 1. Insert at head
    public void insertAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // 2. Insert at tail
    public void insertAtTail(int val) {
        Node newNode = new Node(val);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // 3. Delete node by value
    public void delete(int val) {
        if (head == null) return;

        Node current = head;
        while (current != null && current.data != val) {
            current = current.next;
        }

        if (current == null) return; // Value not found

        if (current == head) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (current == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
            else head = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // 4. Display forward
    public void displayForward() {
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtTail(10);
        dll.insertAtTail(20);
        dll.insertAtTail(30);
        dll.insertAtHead(5);
        dll.displayForward(); // 5 <-> 10 <-> 20 <-> 30 <-> null

        dll.delete(20);
        dll.displayForward(); // 5 <-> 10 <-> 30 <-> null
    }
}

// Time Complexity: Insert at Head/Tail O(1), Delete O(N), Display O(N)
// Space Complexity: O(N)
