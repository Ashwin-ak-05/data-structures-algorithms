package org.example.neetcode150.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        dfs(candidates, target, list, 0, 0);
        return ans;
    }


    public void dfs(int[] candidates, int target, List<Integer> list, int index, int sum) {

        if (sum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (sum > target) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (sum + candidates[i] <= target) {
                list.add(candidates[i]);
                dfs(candidates, target, list, i, sum + candidates[i]);
                list.removeLast();
            }
        }

    }
}
