// Problem: Given a sorted array and a target sum, check if there exists a pair with the given sum.
// Approach: Two Pointers (left from start, right from end)

public class TwoPointerPairSum {

    public static boolean hasPairWithSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == target) {
                System.out.println("Pair found: " + arr[left] + " + " + arr[right] + " = " + target);
                return true;
            } else if (currentSum < target) {
                // Sum is too small, move left pointer forward
                left++;
            } else {
                // Sum is too large, move right pointer backward
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 11, 15};
        int target = 15;

        boolean found = hasPairWithSum(arr, target);
        if (!found) {
            System.out.println("No pair found with target sum " + target);
        }
    }
}

// Time Complexity: O(N) where N is the length of the array
// Space Complexity: O(1)
