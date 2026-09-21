class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = null;
        ListNode second = head;
        ListNode current = head;

        for (int i = 1; i < k; i++) {
            current = current.next;
        }

        first = current;

        while (current.next != null) {
            current = current.next;
            second = second.next;
        }

        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}
