package org.example.searching;

public class MinimumInRotatedArray {
    public int findMin(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int ans = Integer.MAX_VALUE;

        while (l <= r) {
            int m = (l + r) / 2;
            ans = Math.min(arr[m], ans);


            if (arr[m] >= arr[l]) {
                if (m == n-1 || arr[m] >= arr[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }

            } else {
                if (m == 0 || arr[m] <= arr[r]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }
        return ans;
    }
}
