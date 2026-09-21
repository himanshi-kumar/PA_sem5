// Problem: Sort an array using Selection Sort algorithm.
// Approach: Repeatedly find minimum element from unsorted part and place at beginning

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Find index of minimum element in unsorted subarray
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap found minimum with element at index i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original Array: " + Arrays.toString(arr));

        selectionSort(arr);
        System.out.println("Sorted Array (Selection Sort): " + Arrays.toString(arr));
    }
}

// Time Complexity: O(N^2) in all cases
// Space Complexity: O(1)
