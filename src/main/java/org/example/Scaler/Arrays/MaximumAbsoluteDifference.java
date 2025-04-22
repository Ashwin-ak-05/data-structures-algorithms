package org.example.Scaler.Arrays;

import java.util.ArrayList;

/*
You are given an array of N integers, A1, A2, .... AN.
Return the maximum value of f(i, j) for all 1 ≤ i, j ≤ N. f(i, j) is defined as |A[i] - A[j]| + |i - j|,
where |x| denotes absolute value of x.
 */

public class MaximumAbsoluteDifference {
    public int maxArr(ArrayList<Integer> A) {
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i = 0; i<A.size(); i++){
            int sum = A.get(i) + i;
            int diff = A.get(i) - i;

            max1 = Math.max(max1,diff);
            min1 = Math.min(min1,diff);

            max2 = Math.max(max2,sum);
            min2 = Math.min(min2,sum);
        }

        return Math.max(max1-min1,max2-min2);
    }
}
