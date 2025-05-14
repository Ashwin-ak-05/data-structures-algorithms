package org.example.trees;

public class CheckBSTOneChild {
    public String solve(int[] A) {

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        int n = A.length;

        for (int i = 0; i < n; i++) {
            if (A[i] < min || A[i] > max) {
                return "NO";
            }
            if (i + 1 < n) {
                if (A[i + 1] > A[i]) {
                    min = A[i];
                } else {
                    max = A[i];
                }
            }
        }

        return "YES";

    }
}
