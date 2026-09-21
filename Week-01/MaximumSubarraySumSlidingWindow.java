// Problem: Find the maximum sum of any contiguous subarray of size k.
// Approach: Fixed-size Sliding Window

public class MaximumSubarraySumSlidingWindow {

    public static int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        if (n < k || k <= 0) {
            return -1;
        }

        // Calculate sum of first window of size k
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        int maxSum = currentSum;

        // Slide the window across the remaining elements
        for (int i = k; i < n; i++) {
            // Add next element, subtract first element of previous window
            currentSum += arr[i] - arr[i - k];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = maxSubarraySum(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
}

// Time Complexity: O(N) where N is the size of the array
// Space Complexity: O(1)
