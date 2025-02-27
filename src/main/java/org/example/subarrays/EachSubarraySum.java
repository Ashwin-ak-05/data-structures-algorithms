package org.example.subarrays;

public class EachSubarraySum {
    static void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j<n; j++){
                sum =  sum + arr[j];
            }
            System.out.println(sum);
        }
    }
}
