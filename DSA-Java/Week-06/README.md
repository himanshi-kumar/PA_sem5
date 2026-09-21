# Week 06 - QuickSort, Recursion & Backtracking

## 📚 Topics Covered
- QuickSort partitioning (Lomuto partitioning scheme)
- Generating combinations and power sets using recursion/backtracking
- State transitions and decision-making (Include/Exclude paradigm)
- Classic 1D Dynamic Programming (House Robber)

## 📝 Questions Practiced
1. **[QuickSort.java](./QuickSort.java)**: Classic recursive quicksort implementation with in-place partitioning.
2. **[LeetCode78_Subsets.java](./LeetCode78_Subsets.java)**: Generates the power set (all $2^N$ subsets) using backtracking (LeetCode 78).
3. **[LeetCode198_HouseRobber.java](./LeetCode198_HouseRobber.java)**: Finds maximum robbable amount without alerting adjacent alarms using $O(1)$ space DP (LeetCode 198).
4. **[LeetCode17_LetterCombinations.java](./LeetCode17_LetterCombinations.java)**: Explores keypad letter mappings and builds all possible combinations recursively (LeetCode 17).

## 💡 Main Concepts Learned
- Backtracking pattern: **Choose $\to$ Explore (Recurse) $\to$ Unchoose (Backtrack)**.
- QuickSort partitions elements around a pivot, achieving $O(N \log N)$ average time in-place.
- House Robber demonstrates how choice at step $i$ depends only on solutions up to $i-1$ and $i-2$.
