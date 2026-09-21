// LeetCode 54: Spiral Matrix
// Approach: Traverse layer-by-layer using 4 boundary pointers (top, bottom, left, right)

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // 1. Traverse left to right along top row
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            // 2. Traverse top to bottom along right column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // 3. Traverse right to left along bottom row (if row remains)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // 4. Traverse bottom to top along left column (if col remains)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> result = spiralOrder(matrix);
        System.out.println("Spiral Matrix order: " + result);
    }
}

// Time Complexity: O(M * N) where M is rows and N is columns
// Space Complexity: O(1) excluding output list
