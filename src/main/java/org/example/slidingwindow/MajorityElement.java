package org.example.slidingwindow;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int me = nums[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (count == 0) {
                me = nums[i];
            }
            if (nums[i] == me) {
                count++;
            } else {
                count--;
            }
        }
        return me;

    }
}
