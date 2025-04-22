package org.example.Scaler.Queues;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }
            dq.addLast(i);
        }
        ans[0] = nums[dq.peekFirst()];
        int l = 1;
        int r = k;

        while (r < n) {
            while (!dq.isEmpty() && r - dq.peekFirst() + 1 > k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[r]) {
                dq.pollLast();
            }
            dq.addLast(r);
            ans[l] = nums[dq.peekFirst()];
            l++;
            r++;

        }
        return ans;
    }
}
