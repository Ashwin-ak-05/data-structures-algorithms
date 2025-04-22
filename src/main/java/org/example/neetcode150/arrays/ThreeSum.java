package org.example.neetcode150.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<n;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i+1;
            int r = n-1;

            while (l<r){
//                while (l < r && nums[l] == nums[l + 1]) l++; // Skip duplicate 'l'
//                while (l < r && nums[r] == nums[r - 1]) r--;
                int sum = nums[i]+nums[l]+nums[r];
                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[l]);
                    list.add(nums[i]);
                    list.add(nums[r]);
                    ans.add(list);

                    r--;
                    l++;
                }
                else if(sum >0){
                    r--;
                }
                else {
                    l++;
                }
            }
        }
        return ans;
    }
}
