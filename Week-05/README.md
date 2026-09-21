# Week 05 - Sorting Algorithms & LeetCode Applications

## 📚 Topics Covered
- Comparison-based sorting: Bubble Sort (with early exit), Selection Sort, Merge Sort (Divide & Conquer)
- Three-pointer partitioning: Dutch National Flag Algorithm
- Backward merge technique for sorted arrays
- Sorting based on auxiliary key associations (HashMaps / pairs)

## 📝 Questions Practiced
1. **[BubbleSort.java](./BubbleSort.java)**: Classic bubble sort with boolean swap flag optimization.
2. **[SelectionSort.java](./SelectionSort.java)**: Repeatedly identifies minimum element from unsorted portion.
3. **[MergeSort.java](./MergeSort.java)**: Recursive merge sort with divide and merge steps ($O(N \log N)$).
4. **[LeetCode_SortAnArray.java](./LeetCode_SortAnArray.java)**: Implements Merge Sort to solve LeetCode 912.
5. **[LeetCode_SortColors.java](./LeetCode_SortColors.java)**: In-place one-pass sort of 0s, 1s, and 2s using Dutch National Flag (LeetCode 75).
6. **[LeetCode_MergeSortedArray.java](./LeetCode_MergeSortedArray.java)**: In-place merge of two sorted arrays backwards without extra space (LeetCode 88).
7. **[LeetCode_SortThePeople.java](./LeetCode_SortThePeople.java)**: Sorts person names in descending order of their heights (LeetCode 2418).

## 💡 Main Concepts Learned
- Merge Sort gives a guaranteed $O(N \log N)$ time at the cost of $O(N)$ extra space.
- Merging backwards into pre-allocated space (as in LeetCode 88) avoids overwriting unread elements.
- Dutch National Flag uses three pointers (`low`, `mid`, `high`) to partition an array into three regions in $O(N)$ time and $O(1)$ space.
