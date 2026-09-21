// Problem: Find the length of the smallest contiguous subarray whose sum is greater than or equal to a target S.
// Approach: Variable-size Sliding Window (Expand right, shrink left)

public class VariableSlidingWindow {

    public static int minSubArrayLen(int target, int[] arr) {
        int left = 0;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;

        // Expand window using right pointer
        for (int right = 0; right < arr.length; right++) {
            currentSum += arr[right];

            // Shrink window from the left as long as the condition is satisfied
            while (currentSum >= target) {
                int currentLength = right - left + 1;
                if (currentLength < minLength) {
                    minLength = currentLength;
                }
                currentSum -= arr[left];
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int result = minSubArrayLen(target, arr);
        System.out.println("Smallest subarray length with sum >= " + target + " is: " + result);
    }
}

// Time Complexity: O(N) where N is the length of the array
// Space Complexity: O(1)
