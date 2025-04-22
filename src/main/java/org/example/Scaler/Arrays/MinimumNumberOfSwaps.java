package org.example.Scaler.Arrays;

public class MinimumNumberOfSwaps {
    public int solve(int[] A, int B) {
        int n = A.length;
        int len = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] <= B) {
                len++;
            }
        }

        int swaps = 0;
        for (int i = 0; i < len; i++) {
            if (A[i] > B) {
                swaps++;
            }
        }
        max = swaps;

        int s = 1;
        int e = len;

        while (e < n) {
            if (A[s - 1] > B) {
                swaps--;
            }
            if (A[e] > B) {
                swaps++;
            }

            max = Math.min(swaps, max);
            s++;
            e++;
        }

        return max;


    }
}
