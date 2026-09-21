// Problem: Find the N-th node from the end of a Singly Linked List.
// Approach: Two Pointers (fast and slow pointer separated by N nodes)

public class FindNthNodeFromEnd {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node getNthFromLast(Node head, int n) {
        if (head == null || n <= 0) {
            return null;
        }

        Node fast = head;
        Node slow = head;

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return null; // List has fewer than n nodes
            }
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        // Create sample list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int n = 2;
        Node result = getNthFromLast(head, n);
        if (result != null) {
            System.out.println(n + "-th node from the end is: " + result.data); // Expected: 4
        } else {
            System.out.println("Invalid N or list too short.");
        }
    }
}

// Time Complexity: O(L) where L is the length of the list (single pass)
// Space Complexity: O(1)
