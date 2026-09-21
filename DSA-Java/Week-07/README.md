# Week 07 - Recursion Fundamentals & Backtracking

## 📚 Topics Covered
- Anatomy of Recursion: Base case vs Recursive step
- Head Recursion vs Tail Recursion
- Substring vs Subsequence generation
- Recursion tree & stack unwinding
- Bit manipulation & state enumeration (Binary Watch)

## 📝 Questions Practiced
1. **[LeetCode401_BinaryWatch.java](./LeetCode401_BinaryWatch.java)**: Computes all valid clock times matching a specified number of turned-on LED bits (LeetCode 401).
2. **[Fibonacci.java](./Fibonacci.java)**: Compares $O(2^N)$ naive recursive Fibonacci with $O(N)$ linear iterative computation.
3. **[SubstringsAndSubsequences.java](./SubstringsAndSubsequences.java)**: Generates all contiguous substrings and all non-contiguous subsequences.
4. **[HeadRecursion.java](./HeadRecursion.java)**: Demonstrates call execution where the recursive call precedes any local processing.
5. **[TailRecursion.java](./TailRecursion.java)**: Demonstrates recursion where the recursive call is the final statement, using an accumulator for factorial calculation.

## 💡 Main Concepts Learned
- **Head Recursion**: Work happens on the way back (unwinding phase) $\to$ prints 1 to $N$.
- **Tail Recursion**: Work happens on the way down before the recursive call $\to$ prints $N$ down to 1.
- A string of length $N$ has $\frac{N(N+1)}{2}$ non-empty substrings, but $2^N$ subsequences.
