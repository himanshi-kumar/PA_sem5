// Problem: Check if a Doubly Linked List is a Palindrome.
// Approach: Two Pointers (Start from head and tail, moving inward)

public class PalindromeDLL {

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

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Find tail node
        Node left = head;
        Node right = head;
        while (right.next != null) {
            right = right.next;
        }

        // Move inward from both ends
        while (left != right && left.prev != right) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.prev;
        }

        return true;
    }

    public static void main(String[] args) {
        // DLL: 1 <-> 2 <-> 3 <-> 2 <-> 1
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(2);
        Node n5 = new Node(1);

        head.next = n2; n2.prev = head;
        n2.next = n3;   n3.prev = n2;
        n3.next = n4;   n4.prev = n3;
        n4.next = n5;   n5.prev = n4;

        System.out.println("Is DLL 1<->2<->3<->2<->1 a palindrome? " + isPalindrome(head)); // true

        // Modify last element
        n5.data = 9;
        System.out.println("Is DLL 1<->2<->3<->2<->9 a palindrome? " + isPalindrome(head)); // false
    }
}

// Time Complexity: O(N) where N is number of nodes
// Space Complexity: O(1)
