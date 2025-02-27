package org.example.neetcode150.arrays;

public class ContainerMoreWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int ans = Integer.MIN_VALUE;

        int l = 0;
        int r = n-1;

        while (l<r){
            int minHeight = Integer.min(height[l],height[r]);
            int area = (r-l) * minHeight;
            ans = Integer.max(ans,area);

            if(height[l]<height[r]){
                l++;
            }
            else {
                r--;
            }

        }
        return ans;
    }
}
