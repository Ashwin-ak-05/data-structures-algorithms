package org.example.neetcode150.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        dfs(nums,list);
        return ans;
    }

    public void dfs(int[] nums, List<Integer> list) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (list.size() > nums.length) {
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
                dfs(nums, list);
                list.removeLast();
            }
        }
    }
}
