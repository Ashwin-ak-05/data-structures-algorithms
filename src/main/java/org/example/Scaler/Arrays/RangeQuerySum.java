package org.example.Scaler.Arrays;

public class RangeQuerySum {
    int[][] prefixSum;

    public RangeQuerySum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        prefixSum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                prefixSum[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                prefixSum[i][j] += prefixSum[i][j - 1];
            }
        }

        for (int j = 0; j < cols; j++) {
            for (int i = 1; i < rows; i++) {
                prefixSum[i][j] += prefixSum[i - 1][j];
            }
        }

    }

    public int sumRegion(int r1, int c1, int r2, int c2) {

        int sum = prefixSum[r2][c2];

        if (r1 > 0) {
            sum -= prefixSum[r1 - 1][c2];
        }
        if (c1 > 0) {
            sum -= prefixSum[r2][c1 - 1];
        }

        if (r1 > 0 && c1 > 0) {
            sum += prefixSum[r1 - 1][c1 - 1];
        }
        return sum;
    }
}
