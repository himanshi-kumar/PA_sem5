// Problem: Count the total number of nodes in a Circular Linked List.
// Approach: Traverse from head using do-while until reaching head again

public class CircularListCountNodes {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int countNodes(Node head) {
        if (head == null) {
            return 0;
        }

        int count = 0;
        Node current = head;

        do {
            count++;
            current = current.next;
        } while (current != head);

        return count;
    }

    public static void main(String[] args) {
        // Create Circular Linked List: 1 -> 2 -> 3 -> 4 -> (back to 1)
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = head;

        int total = countNodes(head);
        System.out.println("Total nodes in Circular Linked List: " + total); // Expected: 4
    }
}

// Time Complexity: O(N) where N is number of nodes
// Space Complexity: O(1)
