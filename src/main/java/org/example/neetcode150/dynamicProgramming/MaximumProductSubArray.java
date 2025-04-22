package org.example.neetcode150.dynamicProgramming;

public class MaximumProductSubArray {
    int count = 0;

    public int maxProduct(int[] nums) {
        if (nums.length >= 1) {
            count = nums[0];
        }
        // dfs(nums, 0);
        // return count;

        int maxProd = nums[0];

        int right = 1;
        int left = 1;
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            right = right == 0 ? 1 : right;
            left = left == 0 ? 1 : left;

            right = right * nums[i];
            left = left * nums[n - 1 - i];

            maxProd = Math.max(maxProd, Math.max(right, left));
        }
        return maxProd;

//        dfs(nums, 0);
//        return count;
    }

    public void dfs(int[] nums, int index) {

        if (index >= nums.length) {
            return;
        }

        for (int i = index; i < nums.length; i++) {

            multiply(nums, index, i);

        }
        dfs(nums, index + 1);
    }

    public void multiply(int[] nums, int start, int end) {

        int prod = nums[start];

        for (int i = start + 1; i <= end; i++) {
            prod = prod * nums[i];
        }
        count = Math.max(count, prod);


    }
}
