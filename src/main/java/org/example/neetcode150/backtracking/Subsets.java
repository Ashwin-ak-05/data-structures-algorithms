package org.example.neetcode150.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums){
        List<Integer> list = new ArrayList<>();
        dfs(nums,list,0);
        return ans;
    }

    public void dfs(int[] nums, List<Integer> list, int i){
        if(i>=nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        dfs(nums,list,i+1);

        list.removeLast();
        dfs(nums,list,i+1);
    }
}
