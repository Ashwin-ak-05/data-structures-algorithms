package org.example.Scaler.bitManipulation;

public class CountBits {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i >> 1] + (i & 1);
        }

        return arr;

        //arr[0] = 0;
        // int index = 1;
        // for (int i = 1; i <= n; i++) {
        //     int val = i;
        //     int count = 0;
        //     while (val > 0) {
        //         if ((val & 1) == 1) {
        //             count++;
        //         }

        //         val = val >> 1;
        //     }
        //     arr[index] = count;
        //     index++;
        // // }
        // return arr;

    }
}
