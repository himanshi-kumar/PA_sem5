// Problem: Reverse a Doubly Linked List.
// Approach: Swap next and prev pointers for every node

public class ReverseDoublyLinkedList {

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

    public static Node reverseDLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;
        Node temp = null;

        // Swap prev and next for each node
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // Move to next node in original order (which is now current.prev)
            current = current.prev;
        }

        // 'temp' points to the previous node of the last processed node
        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // DLL: 1 <-> 2 <-> 3 <-> 4
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        head.next = n2; n2.prev = head;
        n2.next = n3;   n3.prev = n2;
        n3.next = n4;   n4.prev = n3;

        System.out.print("Original DLL: ");
        printList(head);

        head = reverseDLL(head);

        System.out.print("Reversed DLL: ");
        printList(head); // Expected: 4 <-> 3 <-> 2 <-> 1 <-> null
    }
}

// Time Complexity: O(N) where N is number of nodes
// Space Complexity: O(1)
