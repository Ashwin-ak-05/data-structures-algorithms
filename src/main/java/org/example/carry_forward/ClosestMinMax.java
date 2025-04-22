package org.example.carry_forward;

public class ClosestMinMax {
    int findClosestMinMax(int[] arr) {
        int n = arr.length;

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        if(max ==  min){
            return 1;
        }

        int min_idx = -1;
        int max_idx = -1;
        int ans = n;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == min) {
                min_idx = i;
                if (max_idx != -1) {
                    ans = Math.min(ans, max_idx - min_idx + 1);
                }
            } else if (arr[i] == max) {
                max_idx = i;
                if (min_idx != -1) {
                    ans = Math.min(ans, min_idx - max_idx + 1);
                }
            }
        }
        return ans;


    }
}
