package org.example.sorting;

public class MergeSort {
    public int[] sortArray(int[] arr) {
        int l = 0;
        int h = arr.length - 1;

        merge(arr, l, h);
        return arr;
    }

    public void merge(int[] arr, int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;

            merge(arr, l, m);
            merge(arr, m + 1, h);

            sort(arr, l, h, m);
        }


    }

    public void sort(int[] arr, int l, int h, int mid) {
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
            if (left_arr[i] < right_arr[j]) {
                arr[k] = left_arr[i];
                i++;
            } else {
                arr[k] = right_arr[j];
                j++;
            }
            k++;
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
