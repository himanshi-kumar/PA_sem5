// Problem: Find the first and last occurrence of an element in a sorted array.
// Approach: Modified Binary Search (Lower & Upper Bound)

import java.util.Arrays;

public class FirstAndLastOccurrence {

    public static int findFirst(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                first = mid;
                right = mid - 1; // Keep searching in the left half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return first;
    }

    public static int findLast(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                last = mid;
                left = mid + 1; // Keep searching in the right half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return last;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int target = 5;

        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        System.out.println("First Occurrence of " + target + ": " + first);
        System.out.println("Last Occurrence of " + target + ": " + last);
    }
}

// Time Complexity: O(log N) where N is array length
// Space Complexity: O(1)
