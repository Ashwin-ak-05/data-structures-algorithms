package org.example.Scaler.Arrays;

public class MaxSumInSubArray {
    public long solve(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxSum = Integer.MIN_VALUE;

        // Loop over all column pairs
        for (int left = 0; left < cols; left++) {
            int[] rowSums = new int[rows]; // Stores sum of elements between columns [left, right]

            for (int right = left; right < cols; right++) {
                // Update rowSums with current column
                for (int i = 0; i < rows; i++) {
                    rowSums[i] += matrix[i][right];
                }

                // Apply Kadane's algorithm to find max subarray sum in rowSums
                int currMax = kadane(rowSums);
                maxSum = Math.max(maxSum, currMax);
            }
        }

        return maxSum;
    }

    public int kadane(int[] arr) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
