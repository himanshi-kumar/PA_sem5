// Problem: Calculate the N-th Fibonacci number.
// Implementations: 1. Plain Recursion, 2. Iterative (O(1) space)

public class Fibonacci {

    // 1. Recursive approach
    public static int fibRecursive(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    // 2. Iterative approach
    public static int fibIterative(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {
        int n = 8;

        System.out.println("Fibonacci(" + n + ") using recursion: " + fibRecursive(n));
        System.out.println("Fibonacci(" + n + ") using iteration: " + fibIterative(n));
    }
}

// Time Complexity: O(2^N) for recursive, O(N) for iterative
// Space Complexity: O(N) stack for recursive, O(1) for iterative
