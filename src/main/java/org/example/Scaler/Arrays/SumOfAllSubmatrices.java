package org.example.Scaler.Arrays;

public class SumOfAllSubmatrices {
    public int solve(int[][] A) {
        int sum = 0;
        int n = A.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += (i + 1) * (j + 1) * (n - i) * (n - j) * A[i][j];
            }
        }

        return sum;
    }
}
