// Problem: Insert a new node at the beginning of a Circular Linked List.
// The new node becomes the new head, and the last node's next pointer is updated to this new head.

public class CircularListInsertBeginning {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node insertAtBeginning(Node head, int val) {
        Node newNode = new Node(val);

        // If list is empty
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        // Find the last node in the circular list
        Node current = head;
        while (current.next != head) {
            current = current.next;
        }

        // Update pointers
        current.next = newNode;
        newNode.next = head;

        // New node is now the head
        return newNode;
    }

    public static void display(Node head) {
        if (head == null) return;
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head: " + head.data + ")");
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertAtBeginning(head, 30);
        head = insertAtBeginning(head, 20);
        head = insertAtBeginning(head, 10);

        System.out.print("CLL after inserting at beginning: ");
        display(head); // Expected: 10 -> 20 -> 30 -> (head: 10)
    }
}

// Time Complexity: O(N) to traverse to the last node
// Space Complexity: O(1)
