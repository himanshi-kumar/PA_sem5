// LeetCode 1456: Maximum Number of Vowels in a Substring of Given Length
// Approach: Fixed-size Sliding Window of length k

public class MaximumVowels {

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int maxVowels(String s, int k) {
        int count = 0;

        // Count vowels in the first window of size k
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        int maxVowelsCount = count;

        // Slide the window across the string
        for (int i = k; i < s.length(); i++) {
            // Add new character entering window
            if (isVowel(s.charAt(i))) {
                count++;
            }
            // Remove character exiting window
            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            if (count > maxVowelsCount) {
                maxVowelsCount = count;
            }
        }

        return maxVowelsCount;
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println("Maximum vowels in substring of size " + k + ": " + maxVowels(s, k));
    }
}

// Time Complexity: O(N) where N is the length of the string
// Space Complexity: O(1)
