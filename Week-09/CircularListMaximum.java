// Problem: Find the maximum value node in a Circular Linked List.
// Approach: Traverse the full circle and track maximum value

public class CircularListMaximum {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int findMax(Node head) {
        if (head == null) {
            return Integer.MIN_VALUE;
        }

        int maxVal = head.data;
        Node current = head.next;

        while (current != head) {
            if (current.data > maxVal) {
                maxVal = current.data;
            }
            current = current.next;
        }

        return maxVal;
    }

    public static void main(String[] args) {
        // CLL: 15 -> 42 -> 8 -> 99 -> 23 -> (back to 15)
        Node head = new Node(15);
        Node n2 = new Node(42);
        Node n3 = new Node(8);
        Node n4 = new Node(99);
        Node n5 = new Node(23);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = head;

        int maximum = findMax(head);
        System.out.println("Maximum element in Circular Linked List: " + maximum); // Expected: 99
    }
}

// Time Complexity: O(N) where N is number of nodes
// Space Complexity: O(1)
