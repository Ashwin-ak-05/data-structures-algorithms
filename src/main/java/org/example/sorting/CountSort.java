package org.example.sorting;

public class CountSort {

    public int[] countSort(int[] arr) {
        int[] count_arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            count_arr[arr[i]]++;
        }

        int k = 0;

        for (int i = 0; i < count_arr.length; i++) {
            int freq = count_arr[i];
            for (int j = 1; j <= freq; j++) {
                arr[k] = i;
                k++;
            }
        }

        return arr;
    }
}
