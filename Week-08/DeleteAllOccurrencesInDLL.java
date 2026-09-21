// Problem: Delete all occurrences of a given key in a Doubly Linked List.
// Approach: Traverse DLL and unlink any node whose data matches key

public class DeleteAllOccurrencesInDLL {

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

    public static Node deleteAllOccurrences(Node head, int key) {
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                // If node to delete is head
                if (current == head) {
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else {
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    }
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                }
            }
            current = current.next;
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
        // DLL: 10 <-> 20 <-> 10 <-> 30 <-> 10
        Node head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(10);
        Node n4 = new Node(30);
        Node n5 = new Node(10);

        head.next = n2; n2.prev = head;
        n2.next = n3;   n3.prev = n2;
        n3.next = n4;   n4.prev = n3;
        n4.next = n5;   n5.prev = n4;

        System.out.print("Original DLL: ");
        printList(head);

        head = deleteAllOccurrences(head, 10);

        System.out.print("After deleting all 10s: ");
        printList(head); // Expected: 20 <-> 30 <-> null
    }
}

// Time Complexity: O(N) where N is number of nodes
// Space Complexity: O(1) in-place
