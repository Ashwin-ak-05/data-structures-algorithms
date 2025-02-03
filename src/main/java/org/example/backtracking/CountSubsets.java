package org.example.backtracking;

public class CountSubsets {

    int sum = 0;
    int[] arr;
    int target;
    int total= 0;
    public int perfectSum(int[] nums, int target) {
        arr = new int[nums.length];
        arr = nums;
        this.target = target;
        count(0,0);
        return total;
    }

    public void count(int i, int sum){
        if(i == arr.length){
            if(sum == target){
                total++;
            }
            return;
        }


        count(i+1,sum+arr[i]);
        count(i+1,sum);
    }
}
