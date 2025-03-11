package org.example.neetcode150.dynamicProgramming;

public class PartitionEqualSubset {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;


        for(int i = 0; i<n; i++){
            sum += nums[i];
        }

        if(sum%2 != 0){
            return false;
        }

        boolean[][] dp = new boolean[2][(sum/2)+1];
        int target = sum/2;

        for(int i = 0; i<2; i++){
            dp[i][0] = true;
        }

        for(int j = 1; j<=target; j++){
            dp[0][j] = false;
        }


        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=target; j++){

                boolean a = false;
                if(j>=nums[i-1]){
                    a = dp[(i-1)%2][j-nums[i-1]];
                }

                boolean b = dp[(i-1)%2][j];

                dp[i%2][j] = a || b;


            }
        }

        return dp[n%2][target];


        // for(int[] arr : dp){
        //     Arrays.fill(arr,-1);
        // }

        // return dfs(nums,nums.length-1,sum/2,dp) == 1 ? true : false;




    }

    public int dfs(int[] nums, int i, int sum, int[][] dp){
        if(sum==0){
            return 1;
        }
        if(sum<0 || i<0){
            return 0;
        }

        if(dp[i][sum] != -1){
            return dp[i][sum];
        }

        int a = 0;
        if(sum >= nums[i]){
            a = dfs(nums, i-1,sum-nums[i],dp);
        }


        int b = dfs(nums, i-1,sum,dp);

        if(a == 1 || b == 1){
            return dp[i][sum] =  1;
        }
        return dp[i][sum] = 0;
    }

    // public boolean dfs(int[] nums, int i, int sum){
    //     if(sum==0){
    //         return true;
    //     }
    //     if(sum<0 || i>=nums.length){
    //         return false;
    //     }

    //     boolean a = dfs(nums, i+1,sum-nums[i]);
    //     boolean b = dfs(nums, i+1,sum);

    //     return a || b;
    // }
}
