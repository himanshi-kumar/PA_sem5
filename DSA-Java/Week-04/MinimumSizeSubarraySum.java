// LeetCode 209: Minimum Size Subarray Sum
// Approach: Variable Sliding Window

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            // When sum >= target, try to shrink window from left
            while (currentSum >= target) {
                int len = right - left + 1;
                if (len < minLength) {
                    minLength = len;
                }
                currentSum -= nums[left];
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        int result = minSubArrayLen(target, nums);
        System.out.println("Minimum Size Subarray Sum length: " + result); // Expected: 2 ([4, 3])
    }
}

// Time Complexity: O(N) where N is the length of nums
// Space Complexity: O(1)
