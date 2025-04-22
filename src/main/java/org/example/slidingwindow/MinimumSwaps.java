package org.example.slidingwindow;

public class MinimumSwaps {
    public static int minSwaps(int[] nums) {
        int k = 0;

        int n = nums.length;
        int ans = 0;


        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                k++;
            }
        }

        if (k == 0) {
            return -1;
        }

        // if (nums[0] == 1 && nums[n - 1] == 1) {
        //     k = k - 1;
        // }


        int count = 0;

        for (int i = 0; i < k; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }

        ans = count;

        int s = 1;
        int e = k;

        while (e < n) {
            if (nums[s - 1] == 0) {
                count--;

            }


            if (nums[e] == 0) {
                count++;
            }


            ans = Math.min(ans, count);
            s++;
            e++;
        }
        return ans;
    }
}
