# Week 04 - Searching Algorithms & Advanced Sliding Window

## 📚 Topics Covered
- Linear Search vs. Binary Search principles
- Iterative and recursive Binary Search implementations
- Finding first and last occurrences (Lower and Upper Bounds)
- Binary Search in Rotated Sorted Arrays
- Advanced variable-size Sliding Window problems (Longest Substring Without Repeating, Min Subarray Size)

## 📝 Questions Practiced
1. **[LongestSubstringWithoutRepeating.java](./LongestSubstringWithoutRepeating.java)**: Finds length of longest substring without repeating characters using a HashSet window (LeetCode 3).
2. **[MinimumSizeSubarraySum.java](./MinimumSizeSubarraySum.java)**: Finds minimal length of a contiguous subarray with sum $\ge target$ (LeetCode 209).
3. **[CountValidSubarrays.java](./CountValidSubarrays.java)**: Counts all contiguous subarrays where product is less than $k$ (LeetCode 713).
4. **[LinearSearch.java](./LinearSearch.java)**: Classic linear search implementation.
5. **[BinarySearch.java](./BinarySearch.java)**: Implements both iterative and recursive binary search on sorted array.
6. **[FirstAndLastOccurrence.java](./FirstAndLastOccurrence.java)**: Binary search for lower and upper boundaries of a repeating target.
7. **[LeetCode33_SearchInRotatedSortedArray.java](./LeetCode33_SearchInRotatedSortedArray.java)**: Binary search on rotated sorted array by finding the sorted half (LeetCode 33).
8. **[LeetCode34_FirstAndLastPosition.java](./LeetCode34_FirstAndLastPosition.java)**: Finds first and last index of target in sorted array in $O(\log N)$ time (LeetCode 34).

## 💡 Main Concepts Learned
- Binary search requires the search space to be monotonic or sorted.
- In rotated sorted arrays, at least one half (left or right of `mid`) is always completely sorted.
- Number of valid subarrays ending at `right` in a sliding window equals `right - left + 1`.
