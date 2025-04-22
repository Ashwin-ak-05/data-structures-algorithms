package org.example.slidingwindow;

public class TwoSumNonDistinct {
    public int solve(int[] A, int B) {
        int MOD = 1000000007;
        int n = A.length;
        int l = 0, r = n - 1;
        int count = 0;

        while (l < r) {
            int sum = A[l] + A[r];

            if (sum == B) {
                if (A[l] == A[r]) {
                    // If all numbers in range [l, r] are the same, count all pairs directly
                    long numElements = (r - l + 1);
                    count = (int) ((count + (numElements * (numElements - 1) / 2)) % MOD);
                    break;
                }

                int leftCount = 1, rightCount = 1;

                // Count duplicates on the left side
                while (l + 1 < r && A[l] == A[l + 1]) {
                    l++;
                    leftCount++;
                }

                // Count duplicates on the right side
                while (r - 1 > l && A[r] == A[r - 1]) {
                    r--;
                    rightCount++;
                }

                count = (count + (leftCount * rightCount) % MOD) % MOD;

                l++;
                r--;
            }
            else if (sum > B) {
                r--; // Decrease sum by moving right pointer left
            }
            else {
                l++; // Increase sum by moving left pointer right
            }
        }
        return count;

    }
}
