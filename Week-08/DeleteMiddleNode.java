// LeetCode 2095: Delete the Middle Node of a Linked List
// Approach: Fast and Slow Pointers (Slow moves 1 step, Fast moves 2 steps)

public class DeleteMiddleNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node deleteMiddle(Node head) {
        // If list is empty or has only 1 node, returning null deletes the node
        if (head == null || head.next == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // 'slow' is now at middle node, delete it by bypassing with 'prev'
        prev.next = slow.next;
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
        // List: 1 -> 3 -> 4 -> 7 -> 1 -> 2 -> 6
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(6);

        System.out.print("Original List: ");
        printList(head);

        head = deleteMiddle(head);

        System.out.print("After deleting middle node (7): ");
        printList(head); // 1 -> 3 -> 4 -> 1 -> 2 -> 6 -> null
    }
}

// Time Complexity: O(N) where N is the number of nodes
// Space Complexity: O(1) in-place
