package org.example.searching;

public class RotatedArraySearch {
    public int search(int[] arr, int k) {
        int n = arr.length;
        int l  = 0;
        int r = n-1;

        while (l<=r){
            int m = (l+r)/2;
            if(arr[m] == k){
                return m;
            }
            if (arr[l] <= arr[m]) {
                if (k >= arr[l] && k < arr[m]) {
                    r = m - 1; // Search left half
                } else {
                    l = m + 1; // Search right half
                }
            }
            // Right half is sorted
            else {
                if (k > arr[m] && k <= arr[r]) {
                    l = m + 1; // Search right half
                } else {
                    r = m - 1; // Search left half
                }
            }
        }
        return -1;
    }
}
