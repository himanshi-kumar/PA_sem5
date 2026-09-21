// Problem: Sort an array using Bubble Sort algorithm.
// Optimization: Stop early if no swaps occurred in a pass (already sorted)

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Last i elements are already in place
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped, array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array: " + Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println("Sorted Array (Bubble Sort): " + Arrays.toString(arr));
    }
}

// Time Complexity: O(N^2) worst/average case, O(N) best case
// Space Complexity: O(1)
