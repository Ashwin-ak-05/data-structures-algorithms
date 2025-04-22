package org.example.neetcode150.arrays;

import java.util.HashSet;

public class FindDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i<nums.length; i++){
            if(hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }
}
