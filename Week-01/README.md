# Week 01 - Java OOP Basics, Exception Handling & Two Pointers

## 📚 Topics Covered
- Core Object-Oriented Programming (OOP) concepts in Java: Encapsulation, Inheritance, Polymorphism, Abstraction
- Robust error and exception handling (`try`, `catch`, `finally`, custom exceptions)
- Introduction to Two-Pointer technique on sorted arrays
- Fixed-size Sliding Window technique for subarray problems

## 📝 Questions Practiced
1. **[OOPPrinciples.java](./OOPPrinciples.java)**: Implements base and derived animal classes demonstrating abstraction, overriding, and encapsulation.
2. **[ExceptionHandling.java](./ExceptionHandling.java)**: Demonstrates handling checked and unchecked exceptions along with a custom `InvalidAgeException`.
3. **[MaximumSubarraySumSlidingWindow.java](./MaximumSubarraySumSlidingWindow.java)**: Finds the maximum sum among all contiguous subarrays of size `k` using a fixed sliding window.
4. **[TwoPointerPairSum.java](./TwoPointerPairSum.java)**: Finds if two numbers in a sorted array add up to a target sum using two pointers.

## 💡 Main Concepts Learned
- Sliding window avoids recalculating overlapping sums from scratch ($O(N)$ vs $O(N \cdot K)$).
- Two pointers can search a sorted array in linear time by moving inward based on comparison with the target sum.
- Clean class design with encapsulation prevents unintended state changes.
