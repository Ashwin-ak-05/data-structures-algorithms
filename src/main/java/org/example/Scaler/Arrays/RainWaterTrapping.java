package org.example.Scaler.Arrays;

public class RainWaterTrapping {
    public int trap(int[] height) {
        int n = height.length;
        int left_max = 0;
        int right_max = n - 1;
        int total = 0;

        int l = 0;
        int r = n - 1;

        while (l <= r) {
            if (height[left_max] < height[right_max]) {
                if (height[left_max] > height[l]) {
                    total += height[left_max] - height[l];
                } else {
                    left_max = l;
                }
                l++;

            } else {
                if (height[right_max] > height[r]) {
                    total += height[right_max] - height[r];
                } else {
                    right_max = r;
                }
                r--;
            }
        }

        return total;
    }
}
