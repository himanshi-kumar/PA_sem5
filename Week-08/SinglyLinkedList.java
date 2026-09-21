// Singly Linked List Implementation in Java
// Operations: Insert at Head, Insert at Tail, Delete by Value, Display

public class SinglyLinkedList {

    // Node definition for Singly Linked List
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // 1. Insert at beginning
    public void insertAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    // 2. Insert at end
    public void insertAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // 3. Delete first occurrence of a value
    public void delete(int val) {
        if (head == null) return;

        if (head.data == val) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != val) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // 4. Display list elements
    public void display() {
        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.insertAtTail(10);
        sll.insertAtTail(20);
        sll.insertAtTail(30);
        sll.insertAtHead(5);
        sll.display(); // 5 -> 10 -> 20 -> 30 -> null

        sll.delete(20);
        sll.display(); // 5 -> 10 -> 30 -> null
    }
}

// Time Complexity: Insert at Head O(1), Insert at Tail O(N), Delete O(N), Display O(N)
// Space Complexity: O(N) for storing N nodes
