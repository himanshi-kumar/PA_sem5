// LeetCode 3: Longest Substring Without Repeating Characters
// Approach: Variable-size Sliding Window using HashSet / frequency array

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // Shrink window from the left until duplicate character is removed
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character to set
            set.add(currentChar);

            // Update maximum length
            int currentLength = right - left + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Longest Substring Without Repeating Characters: " + lengthOfLongestSubstring(s));
    }
}

// Time Complexity: O(N) where N is the length of the string
// Space Complexity: O(min(N, M)) where M is the charset size
