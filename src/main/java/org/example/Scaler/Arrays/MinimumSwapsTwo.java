package org.example.Scaler.Arrays;

public class MinimumSwapsTwo {
    public int solve(int[] A) {
        int n = A.length;
        int swaps = 0;

        for(int i = 0; i<n; i++){
            while(A[i]!=i){
                int temp = A[i];
                A[i] =  A[temp];
                A[temp] = temp;
                swaps++;
            }
        }
        return swaps;
    }
}
