// Problem: Insert a new node after a given key in a Doubly Linked List.
// Approach: Search for the key node, adjust next and prev pointers to insert new node

public class InsertAfterKeyInDLL {

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

    public static void insertAfter(Node head, int key, int newData) {
        Node current = head;

        // Search for the node containing key
        while (current != null && current.data != key) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Key " + key + " not found in DLL.");
            return;
        }

        Node newNode = new Node(newData);

        // Adjust pointers
        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
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
        // DLL: 10 <-> 20 <-> 30
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.print("Original DLL: ");
        printList(head);

        insertAfter(head, 20, 25);

        System.out.print("After inserting 25 after 20: ");
        printList(head); // Expected: 10 <-> 20 <-> 25 <-> 30 <-> null
    }
}

// Time Complexity: O(N) to find key
// Space Complexity: O(1)
