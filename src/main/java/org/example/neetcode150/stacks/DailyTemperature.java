package org.example.neetcode150.stacks;

import java.util.Stack;

public class DailyTemperature {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || temperatures[stack.peek()] >= temperatures[i]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                    int popIdx = stack.pop();
                    ans[popIdx] = i - popIdx;
                }
                stack.push(i);
            }
        }
        return ans;
    }
}
