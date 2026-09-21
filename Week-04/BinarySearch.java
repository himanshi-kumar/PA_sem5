// Problem: Search for a target in a sorted array using Binary Search.
// Implementations: Iterative and Recursive

public class BinarySearch {

    // 1. Iterative Binary Search
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in right half
            } else {
                right = mid - 1; // Search in left half
            }
        }

        return -1; // Target not present
    }

    // 2. Recursive Binary Search
    public static int binarySearchRecursive(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, mid + 1, right, target);
        } else {
            return binarySearchRecursive(arr, left, mid - 1, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        int iterativeIndex = binarySearchIterative(arr, target);
        System.out.println("Iterative Binary Search: " + target + " found at index " + iterativeIndex);

        int recursiveIndex = binarySearchRecursive(arr, 0, arr.length - 1, target);
        System.out.println("Recursive Binary Search: " + target + " found at index " + recursiveIndex);
    }
}

// Time Complexity: O(log N) where N is array length
// Space Complexity: O(1) for iterative, O(log N) recursion stack for recursive
