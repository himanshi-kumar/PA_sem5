# Week 10 - Advanced Linked List LeetCode Problems

## 📚 Topics Covered
- Advanced pointer manipulations on Singly Linked Lists
- Floyd's Cycle Detection (Tortoise and Hare Algorithm)
- Mathematical derivation for finding cycle start node
- Reordering lists by combining three fundamental operations (Find Middle $\to$ Reverse Second Half $\to$ Merge Alternately)
- Rotating lists with cyclic connection
- Two-pointer single-pass swaps ($K$-th from start and $K$-th from end)

## 📝 Questions Practiced
1. **[LeetCode19_RemoveNthNode.java](./LeetCode19_RemoveNthNode.java)**: Removes $N$-th node from end using two-pointer gap in a single pass (LeetCode 19).
2. **[LeetCode24_SwapNodesInPairs.java](./LeetCode24_SwapNodesInPairs.java)**: Swaps adjacent nodes in pairs using dummy node pointer rewiring (LeetCode 24).
3. **[LeetCode1721_SwappingNodes.java](./LeetCode1721_SwappingNodes.java)**: Swaps values of $K$-th node from beginning and end in one pass (LeetCode 1721).
4. **[LeetCode61_RotateList.java](./LeetCode61_RotateList.java)**: Rotates list right by $K$ places by making it circular and breaking at new tail (LeetCode 61).
5. **[LeetCode143_ReorderList.java](./LeetCode143_ReorderList.java)**: Reorders list in $L_0 \to L_n \to L_1 \to L_{n-1} \dots$ in $O(N)$ time and $O(1)$ space (LeetCode 143).
6. **[LeetCode142_LinkedListCycleII.java](./LeetCode142_LinkedListCycleII.java)**: Finds exact cycle entrance node using Floyd's algorithm (LeetCode 142).
7. **[LeetCode141_LinkedListCycle.java](./LeetCode141_LinkedListCycle.java)**: Detects whether a cycle exists in a linked list (LeetCode 141).

## 💡 Main Concepts Learned
- **Floyd's Cycle Finding**: When `slow` and `fast` pointers meet inside a loop, initializing a pointer at `head` and moving both 1 step at a time will cause them to meet at the cycle start.
- Complex linked list transformations (like Reorder List) can often be broken down into simpler modular subproblems: find middle + reverse list + merge lists.
- Using a `dummy` node before the `head` simplifies edge cases when modifying or deleting the head.
