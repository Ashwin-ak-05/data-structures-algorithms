package org.example.Scaler.bitManipulation;

import java.util.Arrays;

/**
 * Given an integer array A of N integers, find the pair of integers in the array which have minimum XOR value. Report the minimum XOR value.
 */

public class MinXOR {
    public int findMinXor(int[] A) {
        Arrays.sort(A);
        int min = Integer.MAX_VALUE;

        for(int i = 1; i<A.length; i++){
            min = Math.min(min, A[i]^A[i-1]);
        }

        return min;
    }
}
