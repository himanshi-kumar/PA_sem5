// Problem: Search for a target element in an unsorted array.
// Approach: Linear Search (Iterate through every element)

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index where target is found
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {15, 23, 7, 42, 9, 31};
        int target = 42;

        int index = linearSearch(arr, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }
}

// Time Complexity: O(N) where N is array length
// Space Complexity: O(1)
