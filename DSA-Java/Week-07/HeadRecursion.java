// Demonstration of Head Recursion
// In Head Recursion, the recursive call is made at the beginning of the function
// before any other processing or work is performed.

public class HeadRecursion {

    // Prints numbers from 1 to n using head recursion
    public static void print1ToN(int n) {
        if (n == 0) {
            return; // Base case
        }

        // Recursive call happens FIRST
        print1ToN(n - 1);

        // Work is done on the unwinding phase (returning from recursion)
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print("Printing 1 to " + n + " using Head Recursion: ");
        print1ToN(n);
        System.out.println();
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N) recursion stack
