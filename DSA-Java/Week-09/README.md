# Week 09 - Circular Linked Lists & Classical Problems

## 📚 Topics Covered
- Circular Linked List (CLL) node structure and loop termination with `do-while`
- Insertion at beginning and end in CLL ($O(N)$ vs maintaining a tail pointer)
- Node deletion (head node, single node, middle/last node)
- Traversal, searching, and maximum element finding in circular structure
- Recursive reverse printing in CLL
- Fast & slow pointer technique in circular structures
- Solving the classical **Josephus Problem** via CLL simulation

## 📝 Questions Practiced
1. **[CircularLinkedList.java](./CircularLinkedList.java)**: Core CLL insertion and cyclic display.
2. **[CircularListCountNodes.java](./CircularListCountNodes.java)**: Counts all nodes by traversing until returning to head.
3. **[CircularListSearch.java](./CircularListSearch.java)**: Searches for an element and returns its index in CLL.
4. **[CircularListInsertBeginning.java](./CircularListInsertBeginning.java)**: Inserts a node before the head and updates the last node's link.
5. **[CircularListDeleteNode.java](./CircularListDeleteNode.java)**: Deletes a node by key value with proper head/tail edge case handling.
6. **[CircularListMaximum.java](./CircularListMaximum.java)**: Finds the maximum node value in CLL.
7. **[CircularListReversePrint.java](./CircularListReversePrint.java)**: Prints CLL elements in reverse order recursively.
8. **[CircularListMiddle.java](./CircularListMiddle.java)**: Uses fast and slow pointers to locate the middle node in CLL.
9. **[JosephusProblem.java](./JosephusProblem.java)**: Simulates the elimination game using a circular list to find the last survivor.

## 💡 Main Concepts Learned
- In CLL, `current.next == head` is the loop exit condition (unlike `current == null` in SLL/DLL).
- `do { ... } while (current != head)` ensures the head node is always processed on the first iteration.
- Simulating circular round-robin elimination with a real circular linked list provides an intuitive $O(N \cdot K)$ solution to the Josephus problem.
