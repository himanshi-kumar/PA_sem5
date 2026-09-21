// Problem: Count number of contiguous subarrays where the product/sum of elements is strictly less than k.
// (Classic Subarray Product Less Than K - LeetCode 713)
// Approach: Variable Sliding Window

public class CountValidSubarrays {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int left = 0;
        int currentProduct = 1;
        int totalCount = 0;

        for (int right = 0; right < nums.length; right++) {
            currentProduct *= nums[right];

            // Shrink from left if product becomes >= k
            while (currentProduct >= k && left <= right) {
                currentProduct /= nums[left];
                left++;
            }

            // Number of valid subarrays ending at 'right' is (right - left + 1)
            totalCount += (right - left + 1);
        }

        return totalCount;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;

        int count = numSubarrayProductLessThanK(nums, k);
        System.out.println("Total valid subarrays with product < " + k + ": " + count);
    }
}

// Time Complexity: O(N) where N is the length of array
// Space Complexity: O(1)
