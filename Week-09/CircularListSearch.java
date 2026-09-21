// Problem: Search for an element in a Circular Linked List.
// Returns 0-based index if found, or -1 if not found.

public class CircularListSearch {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int searchElement(Node head, int target) {
        if (head == null) {
            return -1;
        }

        Node current = head;
        int index = 0;

        do {
            if (current.data == target) {
                return index;
            }
            current = current.next;
            index++;
        } while (current != head);

        return -1; // Target not found
    }

    public static void main(String[] args) {
        // CLL: 10 -> 25 -> 40 -> 55 -> (back to 10)
        Node head = new Node(10);
        Node n2 = new Node(25);
        Node n3 = new Node(40);
        Node n4 = new Node(55);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = head;

        int target = 40;
        int index = searchElement(head, target);
        System.out.println("Element " + target + " found at index: " + index); // Expected: 2

        System.out.println("Search 99: " + searchElement(head, 99)); // Expected: -1
    }
}

// Time Complexity: O(N) where N is number of nodes
// Space Complexity: O(1)
