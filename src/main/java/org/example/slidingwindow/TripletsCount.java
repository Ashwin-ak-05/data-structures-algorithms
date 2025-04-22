package org.example.slidingwindow;

public class TripletsCount {
    public int countTriplets(int[] nums) {
        int n = nums.length;

        int sum = 0;

        for (int j = 1; j < n - 1; j++) {
            int c_i = 0;
            int k_i = 0;

            for (int i = j - 1; i >= 0; i--) {
                if (nums[i] < nums[j]) {
                    c_i++;
                }
            }

            for (int k = j + 1; k < n; k++) {
                if (nums[k] > nums[j]) {

                }
            }

            int total_count = c_i * k_i;
            sum = sum+total_count;
        }
        return sum;
    }
}
