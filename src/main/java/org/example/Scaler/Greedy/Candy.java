package org.example.Scaler.Greedy;

public class Candy {
    public int candy(int[] A) {
        int n = A.length;

        int[] candies = new int[n];

        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            if (A[i] > A[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        int sum = 0;

        for (int i = n - 2; i >= 0; i--) {
            if (A[i] > A[i + 1] && candies[i] <= candies[i + 1]) {
                candies[i] = candies[i + 1] + 1;
            }
            sum = sum + candies[i];
        }

        return sum + candies[n - 1];

    }
}
