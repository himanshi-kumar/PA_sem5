# Week 03 - Sliding Window, 2D Arrays & Array Manipulation

## 📚 Topics Covered
- Maximum Subarray Sum via Kadane's Algorithm
- Fixed-size vs Variable-size Sliding Window techniques
- Dynamic array operations using Java's `ArrayList`
- 2D Matrix traversal (Spiral order)
- Array mathematics and basic simulation (Pascal's Triangle, Add to Array-Form)

## 📝 Questions Practiced
1. **[MaximumSubarraySum.java](./MaximumSubarraySum.java)**: Finds maximum contiguous sum in an array using Kadane's algorithm.
2. **[MaximumVowels.java](./MaximumVowels.java)**: Finds maximum number of vowels in any substring of length $k$ (LeetCode 1456).
3. **[VariableSlidingWindow.java](./VariableSlidingWindow.java)**: Computes minimal subarray length with sum at least $target$.
4. **[ArrayListOperations.java](./ArrayListOperations.java)**: Comprehensive demo of ArrayList methods (insertion, deletion, traversal, sort).
5. **[SpiralMatrix.java](./SpiralMatrix.java)**: Traverses an $M \times N$ matrix in spiral order (LeetCode 54).
6. **[FindDuplicateAndMissing.java](./FindDuplicateAndMissing.java)**: Identifies the one duplicate and one missing element from 1 to $N$.
7. **[LeetCode989_AddToArrayForm.java](./LeetCode989_AddToArrayForm.java)**: Adds an integer to array-form integer with carry propagation (LeetCode 989).
8. **[LeetCode118_PascalsTriangle.java](./LeetCode118_PascalsTriangle.java)**: Builds Pascal's Triangle up to $N$ rows (LeetCode 118).

## 💡 Main Concepts Learned
- Sliding window optimizes brute force substring/subarray problems from $O(N^2)$ to $O(N)$.
- Boundary management with 4 pointers (`top`, `bottom`, `left`, `right`) prevents out-of-bounds errors in 2D array traversal.
- Kadane's algorithm decides at each step whether to extend the previous subarray or start a new one.
