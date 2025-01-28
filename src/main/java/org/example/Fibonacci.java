package org.example;

import java.util.Arrays;
import java.util.Stack;

public class Fibonacci {

    int[] dp;

    public int fib(int n) {
        dp = new int[n];
        Arrays.fill(dp,-1);
        return calFib(n);
    }

    public int calFib(int n){
        if(n<=1){
            return n;
        }
        if(dp[n-1]==-1){
            dp[n-1]=calFib(n-1)+calFib(n-2);
        }
        return dp[n-1];
    }

    Stack<Integer> stack = new Stack<>();
}



