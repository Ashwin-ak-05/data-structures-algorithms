package org.example.searching;

public class PeakElement {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        if (arr[0] > arr[1]) {
            return 0;
        }
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }

        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] > arr[m - 1] && arr[m] > arr[m + 1]) {
                return m;
            } else if (arr[m] > arr[m - 1]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return -1;
    }
}
