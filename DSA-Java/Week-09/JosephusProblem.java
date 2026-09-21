// Problem: Josephus Problem (Last person standing in a circle after eliminating every k-th person)
// Approach: Simulation using Circular Linked List

public class JosephusProblem {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int josephus(int n, int k) {
        if (n <= 0 || k <= 0) {
            return -1;
        }

        // 1. Build circular linked list of size n (1 to n)
        Node head = new Node(1);
        Node prev = head;
        for (int i = 2; i <= n; i++) {
            prev.next = new Node(i);
            prev = prev.next;
        }
        prev.next = head; // Connect last node to head to make it circular

        // 2. Eliminate every k-th node until 1 node remains
        Node current = head;
        while (current.next != current) {
            // Move k-1 steps to reach the node before the one to be eliminated
            for (int i = 1; i < k; i++) {
                prev = current;
                current = current.next;
            }

            // Eliminate 'current' node
            prev.next = current.next;
            current = prev.next; // Move to next survivor
        }

        return current.data; // Return the survivor's position
    }

    public static void main(String[] args) {
        int n = 7; // 7 people (1, 2, 3, 4, 5, 6, 7)
        int k = 3; // Eliminate every 3rd person

        int survivor = josephus(n, k);
        System.out.println("For n = " + n + ", k = " + k + ", the last survivor is person: " + survivor); // Expected: 4
    }
}

// Time Complexity: O(N * k)
// Space Complexity: O(N) for circular linked list
