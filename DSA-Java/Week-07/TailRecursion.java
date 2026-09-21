// Demonstration of Tail Recursion
// In Tail Recursion, the recursive call is the very last statement in the function.
// No work is left to be done after the recursive call returns.

public class TailRecursion {

    // Prints numbers from n down to 1 using tail recursion
    public static void printNTo1(int n) {
        if (n == 0) {
            return; // Base case
        }

        // Work is done BEFORE the recursive call
        System.out.print(n + " ");

        // Recursive call is the LAST operation (Tail Call)
        printNTo1(n - 1);
    }

    // Calculating factorial using Tail Recursion with an accumulator
    public static int factorialTail(int n, int accumulator) {
        if (n <= 1) {
            return accumulator;
        }
        return factorialTail(n - 1, n * accumulator);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.print("Printing " + n + " down to 1 using Tail Recursion: ");
        printNTo1(n);
        System.out.println();

        int fact = factorialTail(n, 1);
        System.out.println("Factorial of " + n + " using Tail Recursion: " + fact);
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N) recursion stack (can be optimized to O(1) by tail-call optimization)
