// Problem: Generate all Substrings (contiguous) and all Subsequences (non-contiguous) of a string.
// Approach: Iterative for substrings, Recursion for subsequences

import java.util.ArrayList;
import java.util.List;

public class SubstringsAndSubsequences {

    // 1. Generate all Substrings (Contiguous parts)
    public static List<String> getAllSubstrings(String s) {
        List<String> substrings = new ArrayList<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                substrings.add(s.substring(i, j));
            }
        }
        return substrings;
    }

    // 2. Generate all Subsequences (Pick / Don't Pick Recursion)
    private static void generateSubsequencesHelper(String s, int index, String current, List<String> result) {
        if (index == s.length()) {
            result.add(current);
            return;
        }

        // Choice 1: Include current character
        generateSubsequencesHelper(s, index + 1, current + s.charAt(index), result);

        // Choice 2: Exclude current character
        generateSubsequencesHelper(s, index + 1, current, result);
    }

    public static List<String> getAllSubsequences(String s) {
        List<String> subsequences = new ArrayList<>();
        generateSubsequencesHelper(s, 0, "", subsequences);
        return subsequences;
    }

    public static void main(String[] args) {
        String s = "abc";

        System.out.println("All Substrings of \"" + s + "\": " + getAllSubstrings(s));
        System.out.println("All Subsequences of \"" + s + "\": " + getAllSubsequences(s));
    }
}

// Time Complexity: Substrings O(N^2), Subsequences O(2^N)
// Space Complexity: Substrings O(1), Subsequences O(N) recursion stack
