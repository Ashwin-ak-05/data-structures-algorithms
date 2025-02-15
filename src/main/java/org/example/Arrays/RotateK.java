package org.example.Arrays;

public class RotateK {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

    }

    public int[] reverse(int[] s, int i, int j) {
        int l = i;
        int r = j;

        while (l < r) {
            int temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
        return s;

    }
}
