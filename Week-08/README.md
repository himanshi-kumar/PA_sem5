# Week 08 - Singly and Doubly Linked Lists

## 📚 Topics Covered
- Singly Linked List (SLL) and Doubly Linked List (DLL) node representations and memory pointers
- Insertion, deletion, searching, and traversal operations
- Fast and Slow pointer techniques (finding middle, N-th from end)
- Reversal of Linked Lists (in-place pointer manipulation, K-group reversals)
- Palindrome checks in SLL and DLL
- Custom design of a complete Linked List class (LeetCode 707)

## 📝 Questions Practiced
1. **[SinglyLinkedList.java](./SinglyLinkedList.java)**: Core SLL operations (insert head/tail, delete, display).
2. **[FindNthNodeFromEnd.java](./FindNthNodeFromEnd.java)**: Two pointers with $N$-step lead to find node from end in a single pass.
3. **[RemoveDuplicatesFromSortedList.java](./RemoveDuplicatesFromSortedList.java)**: Removes duplicates in-place from sorted SLL (LeetCode 83).
4. **[DeleteMiddleNode.java](./DeleteMiddleNode.java)**: Deletes middle node using fast/slow pointers (LeetCode 2095).
5. **[PalindromeLinkedList.java](./PalindromeLinkedList.java)**: Checks palindrome by reversing second half of SLL (LeetCode 234).
6. **[ReverseNodesInKGroups.java](./ReverseNodesInKGroups.java)**: Reverses nodes in $k$-sized chunks (LeetCode 25).
7. **[DoublyLinkedList.java](./DoublyLinkedList.java)**: DLL with bidirectional `prev` and `next` pointers.
8. **[InsertAfterKeyInDLL.java](./InsertAfterKeyInDLL.java)**: Inserts a new node following a target value in DLL.
9. **[DeleteAllOccurrencesInDLL.java](./DeleteAllOccurrencesInDLL.java)**: Unlinks all nodes containing a target key in DLL.
10. **[ReverseDoublyLinkedList.java](./ReverseDoublyLinkedList.java)**: Reverses DLL by swapping `prev` and `next` pointers.
11. **[SecondLargestInDLL.java](./SecondLargestInDLL.java)**: Finds second largest node value in a single traversal.
12. **[PalindromeDLL.java](./PalindromeDLL.java)**: Two-pointer inward traversal from head and tail in DLL.
13. **[LeetCode707_DesignLinkedList.java](./LeetCode707_DesignLinkedList.java)**: Complete implementation of `MyLinkedList` (LeetCode 707).

## 💡 Main Concepts Learned
- Fast & slow pointer (tortoise and hare) pattern allows finding the middle or cycle in $O(N)$ time and $O(1)$ space.
- Reversing a doubly linked list only requires swapping the `prev` and `next` references for each node.
- Dummy nodes eliminate edge-case checks when modifying or deleting head nodes.
