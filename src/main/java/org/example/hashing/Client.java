package org.example.hashing;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        int[] arr = {1,5,4,2,9,9,9};
        //System.out.println(SubArrayWithSumZero.findsum(arr));
//        PairSumK pairSumK = new PairSumK();
//
//        System.out.println(pairSumK.findPair(arr, 2));
//
//        CountPairs countPairs = new CountPairs();
//        System.out.println(countPairs.countPairs(arr, 3));

//        DistinctElementWindow distinctElementWindow = new DistinctElementWindow();
//        ArrayList<Integer> result = distinctElementWindow.countDistinct(arr,4);
//        for (Integer i : result) {
//            System.out.print(i + " ");
//        }

        MaximumSumOfDistinctElement maximumSumOfDistinctElement = new MaximumSumOfDistinctElement();
        System.out.println(maximumSumOfDistinctElement.maximumSubarraySum(arr,3));
    }
}
