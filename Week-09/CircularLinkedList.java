// Circular Linked List Implementation in Java
// The last node points back to the head node instead of null

public class CircularLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // 1. Insert node at end of circular list
    public void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Point to itself
            return;
        }

        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = head;
    }

    // 2. Display all elements
    public void display() {
        if (head == null) {
            System.out.println("Circular List is empty.");
            return;
        }

        Node current = head;
        System.out.print("Circular List: ");
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head: " + head.data + ")");
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);

        cll.display(); // 10 -> 20 -> 30 -> 40 -> (head: 10)
    }
}

// Time Complexity: Insert O(N), Display O(N)
// Space Complexity: O(N) for N nodes
