// Problem: Given an unsorted array of size N containing numbers from 1 to N.
// One number is repeating and one number is missing. Find both.
// Approach: Frequency count array / Hashing

import java.util.Arrays;

public class FindDuplicateAndMissing {

    public static int[] findTwoElement(int[] arr, int n) {
        int[] count = new int[n + 1];
        int repeating = -1;
        int missing = -1;

        // Count frequency of each number
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Check which number appears twice and which appears zero times
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                repeating = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }

        return new int[]{repeating, missing};
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        int n = arr.length;

        int[] result = findTwoElement(arr, n);
        System.out.println("Repeating Number: " + result[0]);
        System.out.println("Missing Number: " + result[1]);
    }
}

// Time Complexity: O(N) where N is the length of the array
// Space Complexity: O(N) for count array
