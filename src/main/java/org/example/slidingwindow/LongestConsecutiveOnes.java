package org.example.slidingwindow;

public class LongestConsecutiveOnes {
    static int maxOnesIndex(int[] nums){
        int n = nums.length;
        int maxIndex = -1;
        int count = 0;

        for(int i = 0; i<n; i++){
            count = 0;
            if(nums[i]==0){
                for(int i1 = i+1;i1<n;i1++){
                    if(nums[i1] == 0){
                        break;
                    }
                    count++;
                }

                //if(i>0){
                    for(int i1 = i-1;i1>=0;i1--){
                        if(nums[i1] == 0){
                            break;
                        }
                        count++;
                    }
               // }

                maxIndex = Math.max(count+1,maxIndex);

            }
        }
        return maxIndex;
    }
}
