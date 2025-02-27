package org.example.subarrays;

public class PrintSubarrays {
    static void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for(int s = i; s<=j; s++){
                    System.out.print(arr[s] + " ");
                }
                System.out.println(" ");

            }

        }
    }
}
