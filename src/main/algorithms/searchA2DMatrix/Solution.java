package main.algorithms.searchA2DMatrix;

public class Solution {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 13;
        System.out.println(searchMatrixV2(matrix, target));
    }

    public static boolean searchMatrixV2(int[][] matrix, int target) {
        if (matrix.length == 0) return false;

        int rows = matrix.length;
        int column = matrix[0].length;

        int left = 0;
        int right = rows * column - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            int midpointElement = matrix[middle / column][middle % column];
            if (midpointElement == target) {
                return true;
            } else if (target < midpointElement) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        return false;
    }
}
