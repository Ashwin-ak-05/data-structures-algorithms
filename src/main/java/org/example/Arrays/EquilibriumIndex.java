package org.example.Arrays;

public class EquilibriumIndex {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix_sum = new int[n - 1];
        prefix_sum[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + nums[i];
        }

        int pivot_index = -1;
        if (prefix_sum[n - 1] - prefix_sum[0] == 0) {
            return 0;
        }

        for (int i = 1; i < n; i++) {
            int left = prefix_sum[i - 1];
            int right = prefix_sum[n - 1] - prefix_sum[i];
            if (left == right) {
                return i;
            }
        }
        return pivot_index;
    }
}
