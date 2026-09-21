// Problem: Delete a node by value in a Circular Linked List.
// Handles cases: single-node list, deleting head node, deleting internal/tail node.

public class CircularListDeleteNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node deleteNode(Node head, int key) {
        if (head == null) {
            return null;
        }

        // Case 1: List has only 1 node
        if (head.data == key && head.next == head) {
            return null;
        }

        Node current = head;
        Node prev = null;

        // Case 2: Head node is to be deleted
        if (head.data == key) {
            // Find last node
            while (current.next != head) {
                current = current.next;
            }
            current.next = head.next;
            head = head.next;
            return head;
        }

        // Case 3: Key is at middle or end
        current = head;
        while (current.next != head && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current.data == key) {
            prev.next = current.next;
        }

        return head;
    }

    public static void display(Node head) {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head: " + head.data + ")");
    }

    public static void main(String[] args) {
        // CLL: 10 -> 20 -> 30 -> 40 -> (back to 10)
        Node head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = head;

        System.out.print("Original CLL: ");
        display(head);

        head = deleteNode(head, 10); // Delete head
        System.out.print("After deleting 10 (head): ");
        display(head);

        head = deleteNode(head, 30); // Delete middle
        System.out.print("After deleting 30: ");
        display(head);
    }
}

// Time Complexity: O(N) where N is number of nodes
// Space Complexity: O(1)
