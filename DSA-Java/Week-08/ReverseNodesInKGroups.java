// LeetCode 25: Reverse Nodes in k-Group
// Approach: Iteratively check if k nodes exist, reverse k nodes, reconnect pointers

public class ReverseNodesInKGroups {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseKGroup(Node head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        // Dummy node to handle head updates easily
        Node dummy = new Node(0);
        dummy.next = head;

        Node prevGroupEnd = dummy;

        while (true) {
            // Check if there are at least k nodes remaining
            Node kthNode = prevGroupEnd;
            for (int i = 0; i < k && kthNode != null; i++) {
                kthNode = kthNode.next;
            }

            if (kthNode == null) {
                break; // Less than k nodes left, keep as is
            }

            Node nextGroupStart = kthNode.next;
            Node current = prevGroupEnd.next;
            Node prev = nextGroupStart;

            // Reverse k nodes
            while (current != nextGroupStart) {
                Node temp = current.next;
                current.next = prev;
                prev = current;
                current = temp;
            }

            // Connect previous group to reversed group
            Node temp = prevGroupEnd.next;
            prevGroupEnd.next = kthNode;
            prevGroupEnd = temp;
        }

        return dummy.next;
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
        // List: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 2;
        System.out.print("Original List: ");
        printList(head);

        head = reverseKGroup(head, k);

        System.out.print("After reverse in groups of " + k + ": ");
        printList(head); // Expected: 2 -> 1 -> 4 -> 3 -> 5 -> null
    }
}

// Time Complexity: O(N) where N is number of nodes
// Space Complexity: O(1) in-place
