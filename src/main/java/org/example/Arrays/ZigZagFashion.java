package org.example.Arrays;

public class ZigZagFashion {
    public static void zigZag(int[] arr) {
        int n = arr.length;

        if (n == 1) {
            return;
        }

        boolean up = true;

        for (int i = 1; i < n; i++) {
            if (up) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                }
            } else {
                if (arr[i] > arr[i - 1]) {
                    swap(arr, i, i - 1);
                }
            }

            up = !up;
        }
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
