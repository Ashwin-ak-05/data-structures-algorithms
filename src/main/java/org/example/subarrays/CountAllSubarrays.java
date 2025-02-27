package org.example.subarrays;

public class CountAllSubarrays {
    public static long subarraySum(int[] arr) {
        final int MOD = 1000000007;
        long sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum =  (sum + ((long) (i + 1) * (n - i) * arr[i])) % MOD;
        }

        return sum;
    }
}
