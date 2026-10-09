public class DetectAndRemoveCycle {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean detectAndRemoveCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;
        boolean found = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                found = true;
                break;
            }
        }

        if (!found) {
            return false;
        }

        Node start = head;
        while (start != slow) {
            start = start.next;
            slow = slow.next;
        }

        Node last = start;
        while (last.next != start) {
            last = last.next;
        }

        last.next = null;
        return true;
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        head.next.next.next.next.next = head.next.next;

        boolean result = detectAndRemoveCycle(head);

        System.out.println("Cycle found: " + result);
        System.out.println("List after removing cycle:");
        printList(head);
    }
}
