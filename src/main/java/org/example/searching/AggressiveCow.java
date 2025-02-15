package org.example.searching;

import java.util.Arrays;

public class AggressiveCow {
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int l = min_diff(arr);
        int h = arr[n - 1] - arr[0];
        int ans = l;

        while (l <= h) {
            int m = (l + h) / 2;
            if (canPlace(arr, m, k)) {
                ans = m;
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return ans;
    }

    public int min_diff(int[] arr) {
        int diff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            diff = Math.min(diff, arr[i] - arr[i - 1]);
        }
        return diff;
    }

    boolean canPlace(int[] arr, int m, int k) {
        int last = arr[0];  // Store the position, not index
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - last >= m) {
                last = arr[i]; // Store the stall position
                count++;
            }
            if (count >= k) {
                return true;
            }
        }
        return false;
    }
}
