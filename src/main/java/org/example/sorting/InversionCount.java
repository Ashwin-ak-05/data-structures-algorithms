package org.example.sorting;

import org.example.sorting.models.Response;

public class InversionCount {
    int count = 0;

    int inversionCount(int[] arr) {
        count = 0;
        sort(arr, 0, arr.length - 1);

        return count;
    }

    void sort(int[] arr, int l, int h) {
        if (l < h) {
            //int m = (l + h) / 2;
            int m = l + (h - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, h);
            merge(arr, l, h, m);
        }
    }

    void merge(int[] arr, int l, int h, int mid) {
        int n = mid - l + 1;
        int m = h - mid;
        int k = l;

        int[] left_arr = new int[n];
        int[] right_arr = new int[m];

        for (int i = 0; i < n; i++) {
            left_arr[i] = arr[l + i];
        }

        for (int i = 0; i < m; i++) {
            right_arr[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (left_arr[i] <= right_arr[j]) {
                arr[k] = left_arr[i];
                i++;
                k++;
            } else {
                arr[k] = right_arr[j];
                count = count + (n - i);
                j++;
                k++;
            }
        }

        while (i < n) {
            arr[k] = left_arr[i];
            i++;
            k++;
        }
        while (j < m) {
            arr[k] = right_arr[j];
            j++;
            k++;
        }
    }
}
