package org.example.sorting;

public class ReversePairs {
    int count;

    public int reversePairs(int[] arr) {
        count = 0;
        sort(arr, 0, arr.length - 1);
        return count;

    }

    public void sort(int[] arr, int l, int r) {
        if (l >= r)
            return;
        int mid = (l + r) / 2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public void merge(int[] arr, int l, int mid, int r) {
        int n = mid - l + 1;
        int m = r - mid;

        int[] left = new int[n];
        int[] right = new int[m];

        for (int i = 0; i < n; i++) {
            left[i] = arr[i + l];
        }

        for (int i = 0; i < m; i++) {
            right[i] = arr[mid + 1 + i];
        }

        countPairs(left, right);

        int i = 0;
        int j = 0;

        int k = l;

        while (i < n && j < m) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }

        while (i < n) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < m) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }

    public void countPairs(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if ((long) arr1[i] > 2L * arr2[j]) {
                count += n - i;
                j++;
            } else {
                i++;
            }
        }
    }
}
