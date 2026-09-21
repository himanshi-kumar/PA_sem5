// Problem: Find the middle node of a Circular Linked List.
// Approach: Slow and Fast Pointers (Slow moves 1 step, Fast moves 2 steps)

public class CircularListMiddle {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node findMiddle(Node head) {
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        // Loop until fast wraps back to head
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        // CLL: 10 -> 20 -> 30 -> 40 -> 50 -> (back to 10)
        Node head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = head;

        Node mid = findMiddle(head);
        System.out.println("Middle element of CLL: " + (mid != null ? mid.data : "null")); // Expected: 30
    }
}

// Time Complexity: O(N) where N is number of nodes
// Space Complexity: O(1)
