package org.example.neetcode150.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class KFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }

        List<Integer>[] bucket = new List[nums.length+1];
       // Arrays.fill(bucket,new ArrayList<>());

        for(Integer key : hm.keySet()){
            int freq = hm.get(key);
            if (bucket[freq] == null) {   // Creates a separate list for each frequency
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int[] ans = new int[k];

        int k_idx = 0;

        int i =  bucket.length - 1;

        while (i>=0 && k_idx<k){
            List<Integer> bucketList = bucket[i];
            if(bucketList != null){
                for(int i1 = 0; i1<bucketList.size(); i1++){
                    ans[k_idx] = bucketList.get(i1);
                    k_idx++;
                    if(k_idx == k){
                        break;
                    }
                }
            }

            i--;
        }
        return ans;
//
//
//        int i = bucket.length-1;
//
//        while (i>=0 && ans.length<=k){
//            for(int i1 = 0; i1<bucket[i].size() && ans.length<=k; i++){
//                ans[k_idx] = bucket[i].get(i1);
//                k_idx++;
//            }
//            i++;
//        }
//        return ans;

    }
}
