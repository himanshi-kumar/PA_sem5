// Problem: Find the second largest element in a Doubly Linked List.
// Approach: Single-pass traversal tracking first and second largest values

public class SecondLargestInDLL {

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

    public static int findSecondLargest(Node head) {
        if (head == null || head.next == null) {
            return -1; // List has fewer than 2 elements
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        Node current = head;
        while (current != null) {
            if (current.data > largest) {
                secondLargest = largest;
                largest = current.data;
            } else if (current.data > secondLargest && current.data != largest) {
                secondLargest = current.data;
            }
            current = current.next;
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        // DLL: 12 <-> 35 <-> 1 <-> 10 <-> 34 <-> 1
        Node head = new Node(12);
        Node n2 = new Node(35);
        Node n3 = new Node(1);
        Node n4 = new Node(10);
        Node n5 = new Node(34);

        head.next = n2; n2.prev = head;
        n2.next = n3;   n3.prev = n2;
        n3.next = n4;   n4.prev = n3;
        n4.next = n5;   n5.prev = n4;

        int secondMax = findSecondLargest(head);
        System.out.println("Second largest element in DLL: " + secondMax); // Expected: 34
    }
}

// Time Complexity: O(N) where N is number of nodes
// Space Complexity: O(1)
