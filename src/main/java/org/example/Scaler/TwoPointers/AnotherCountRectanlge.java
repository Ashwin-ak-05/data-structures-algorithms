package org.example.Scaler.TwoPointers;

/**
 * Given a sorted array of distinct integers A and an integer B, find and return how many rectangles with distinct configurations can be created using elements of this array as length and breadth whose area is lesser than B.
 *
 * (Note that a rectangle of 2 x 3 is different from 3 x 2 if we take configuration into view)
 */

public class AnotherCountRectanlge {
    public int solve(int[] A, int B) {
        int n = A.length;

        long ans = 0;

        int l = 0, r = n-1;

        while(l <= r) {
            long multiply = (long)A[l] * (long)A[r];
            if(multiply < B) {
                ans = ans + (2 * (r-l) + 1);
                l++;
            }
            else {
                r--;
            }
        }

        return (int)(ans % 1000000007);
    }
}
