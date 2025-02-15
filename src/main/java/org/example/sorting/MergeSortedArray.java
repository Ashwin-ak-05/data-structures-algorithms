package org.example.sorting;

public class MergeSortedArray {
    public int[] mergeArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] sort_arr = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                sort_arr[k] = a[i];
                i++;
                k++;
            } else {
                sort_arr[k] = b[j];
                j++;
                k++;
            }
        }

        while (i < n) {
            sort_arr[k] = a[i];
            i++;
            k++;
        }

        while (j < m) {
            sort_arr[k] = b[j];
            j++;
            k++;
        }

        return sort_arr;
    }
}
