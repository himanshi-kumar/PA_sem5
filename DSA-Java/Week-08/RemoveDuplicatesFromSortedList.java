// LeetCode 83: Remove Duplicates from Sorted List
// Approach: Traverse list and skip nodes with duplicate values

public class RemoveDuplicatesFromSortedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node deleteDuplicates(Node head) {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                // Skip the duplicate node
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // List: 1 -> 1 -> 2 -> 3 -> 3
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        System.out.print("Before removing duplicates: ");
        printList(head);

        head = deleteDuplicates(head);

        System.out.print("After removing duplicates: ");
        printList(head); // Expected: 1 -> 2 -> 3 -> null
    }
}

// Time Complexity: O(N) where N is number of nodes
// Space Complexity: O(1) in-place
