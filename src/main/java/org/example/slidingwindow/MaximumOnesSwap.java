package org.example.slidingwindow;

public class MaximumOnesSwap {
    static int maximum_one(int[] nums) {
        int n = nums.length;
        int max = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = 0;
            if (nums[i] == 0) {
                for (int i1 = i - 1; i1 >= 0; i1--) {
                    if (nums[i1] == 1) {
                        l++;
                    } else {
                        break;

                    }
                }

                for (int i1 = i + 1; i1 < n; i1++) {
                    if (nums[i1] == 1) {
                        r++;
                    } else {
                        break;
                    }
                }

                if (count > l + r) {
                    max = Math.max(max, l + r + 1);
                } else {
                    max = Math.max(max, l);
                    max = Math.max(max, r);
                }
            }
        }
        return max;
    }
}
