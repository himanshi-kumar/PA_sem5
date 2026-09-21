// Problem: Find the contiguous subarray within an array which has the largest sum.
// Approach: Kadane's Algorithm

public class MaximumSubarraySum {

    public static int maxSubArray(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Either add current element to existing subarray or start fresh from arr[i]
            if (currentSum + arr[i] > arr[i]) {
                currentSum += arr[i];
            } else {
                currentSum = arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(arr);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}

// Time Complexity: O(N) where N is the number of elements
// Space Complexity: O(1)
