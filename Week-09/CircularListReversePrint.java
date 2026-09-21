// Problem: Print a Circular Linked List in reverse order using recursion.
// Approach: Recursively visit next node until reaching head again, then print on stack return.

public class CircularListReversePrint {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static void printReverseHelper(Node current, Node head) {
        if (current == null) {
            return;
        }

        // If next is head, we've completed circle, start returning
        if (current.next != head) {
            printReverseHelper(current.next, head);
        }

        // Print on unwinding
        System.out.print(current.data + " ");
    }

    public static void printReverse(Node head) {
        if (head == null) {
            return;
        }
        printReverseHelper(head, head);
        System.out.println();
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

        System.out.print("Circular List in Reverse: ");
        printReverse(head); // Expected: 40 30 20 10
    }
}

// Time Complexity: O(N) where N is number of nodes
// Space Complexity: O(N) recursion stack
