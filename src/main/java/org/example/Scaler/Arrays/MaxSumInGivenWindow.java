package org.example.Scaler.Arrays;

public class MaxSumInGivenWindow {
    public int solve(int[][] A, int B) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        for (int col = 0; col < n; col++) {
            for (int row = 1; row < n; row++) {
                A[row][col] += A[row - 1][col];
            }
        }


        for (int row = B - 1; row < n; row++) {

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                if (row >= B) {
                    arr[i] = A[row][i] - A[row - B][i];
                } else {
                    arr[i] = A[row][i];
                }
            }


            int sum = 0;

            for (int i = 0; i < B; i++) {
                sum += arr[i];
            }

            max = Math.max(max, sum);

            int s = 1;
            int e = B;

            while (e < n) {


                sum -= arr[s - 1];
                sum += arr[e];
                max = Math.max(sum, max);
                s++;
                e++;
            }
        }

        return max;
    }
}
