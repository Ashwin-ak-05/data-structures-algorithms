package org.example.sorting;

public class QuickSort {
    int[] sort(int[] arr) {
        quickSort(arr,0,arr.length-1);
        return arr;
    }

    void quickSort(int[] arr, int s, int e) {
        if (s < e) {
            int p = arr[e];
            int i = s;
            int j = s;

            while (i < e) {
                if (arr[i] < p) {
                    swap(arr, i, j);
                    j++;
                }
                i++;
            }

            swap(arr, j, e);

            int pivot = j;

            quickSort(arr,s,pivot-1);
            quickSort(arr,pivot+1,e);
        }
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
