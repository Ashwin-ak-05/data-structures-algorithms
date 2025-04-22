package org.example.neetcode150.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChange {
    int[] dp;
    public int coinChange(int[] coins, int amount) {
        dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int result = dfs(coins,amount);
        return result == Integer.MAX_VALUE ? -1 : result;

    }

    public int dfs(int[] coins, int amount){
        if(amount == 0){
            return 0;
        }
        if(amount<0){
            return Integer.MAX_VALUE;
        }

        if(dp[amount] != -1){
            return dp[amount];
        }

        int maxCount = Integer.MAX_VALUE;

        for(int i = 0; i<coins.length; i++){
            int bal = dfs(coins, amount - coins[i]);
            if(bal != Integer.MAX_VALUE){
                maxCount = Math.min(maxCount,bal+1);
            }
        }

        dp[amount] = maxCount;
        return dp[amount];
    }


}


/*
public void dfs(int[] coins, int amount, int index, Long sum, List<Integer> list) {
        if(sum == amount){
            count = Math.min(list.size(),count);
            return;
        }
        if (sum > amount){
            return;
        }

        for(int i = index; i<coins.length; i++ ){
            if(sum+coins[i]<=amount){
                list.add(coins[i]);;
                dfs(coins,amount,index,sum+coins[i],list);
                list.removeLast();
            }
        }
    }
 */
