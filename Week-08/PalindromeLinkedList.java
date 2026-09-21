// LeetCode 234: Palindrome Linked List
// Approach: Find middle using fast/slow pointer, reverse second half, compare both halves

public class PalindromeLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        // 1. Find middle of list
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse second half
        Node secondHalf = reverseList(slow.next);

        // 3. Compare first half and reversed second half
        Node p1 = head;
        Node p2 = secondHalf;
        boolean palindrome = true;

        while (p2 != null) {
            if (p1.data != p2.data) {
                palindrome = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // Optional: restore the original list by reversing back
        slow.next = reverseList(secondHalf);

        return palindrome;
    }

    public static void main(String[] args) {
        // List: 1 -> 2 -> 2 -> 1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println("Is 1->2->2->1 a palindrome? " + isPalindrome(head));

        // List: 1 -> 2 -> 3
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);

        System.out.println("Is 1->2->3 a palindrome? " + isPalindrome(head2));
    }
}

// Time Complexity: O(N) where N is number of nodes
// Space Complexity: O(1)
