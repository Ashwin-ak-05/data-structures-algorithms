package org.example.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PrintAllSubsets {

    List<List<Integer>> result = new ArrayList<>();
    HashSet<Integer> hashSet = new HashSet<>();
    int[] nums;

    public List<List<Integer>> subsets(int[] nums) {
        this.nums = new int[nums.length];
        this.nums = nums;
      if(nums.length == 1){
            //if(nums[0]==0){
            result.add(new ArrayList<>());
            List<Integer> list = new ArrayList<>();
            list.add(nums[0]);
            result.add(list);
            return result;
            //  }
        }

        this.nums = new int[nums.length];
        this.nums = nums;
        int[] arr = new int[nums.length];
        Arrays.fill(arr, Integer.MIN_VALUE);
        //result.add(new ArrayList<>());
        addSubsets(arr, 0);
        return result;
    }

    public void addSubsets(int[] arr, int i) {

        if (arr.length == i) {
            List<Integer> list = new ArrayList<>();
            int val = 0;
            for (int n : arr) {
                if (n != Integer.MIN_VALUE) {
                    list.add(n);
                    val = val * 10 + n;
                }
            }
            if (!hashSet.contains(val)) {
                hashSet.add(val);
                result.add(list);
            }

            return;
        }


        arr[i] = nums[i];
        addSubsets(arr, i + 1);

        arr[i] = Integer.MIN_VALUE;
        addSubsets(arr, i + 1);


    }
}
