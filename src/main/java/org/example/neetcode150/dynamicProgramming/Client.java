package org.example.neetcode150.dynamicProgramming;

import org.example.LongestCommonSubsequent;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
//        RobberTwo robberTwo = new RobberTwo();
//        int[] arr = {2,1,1,2};
//        System.out.println(robberTwo.rob(arr));
//        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
//        String string = "bb";
//        System.out.println(longestPalindromicSubstring.longestPalindrome(string));
//        DecodeWays decodeWays = new DecodeWays();
//        String string = "123";
//        System.out.println(decodeWays.numDecodings(string));

//        CoinChange coinChange = new CoinChange();
//        int[] coins = {5,1,2};
//        System.out.println(coinChange.coinChange(coins,11));

//        MaximumProductSubArray maximumProductSubArray = new MaximumProductSubArray();
//        int[] nums = {-2,0,-1};
//        System.out.println(maximumProductSubArray.maxProduct(nums));

//        WordBreak wordBreak = new WordBreak();
//        String s = "leetcode";
//        List<String> wordDict = new ArrayList<>();
//        wordDict.add("leet");
//        wordDict.add("code");
//        System.out.println(wordBreak.wordBreak(s,wordDict));

//        EditDistance editDistance = new EditDistance();
//        String s1 = "intention";
//        String s2 = "execution";
//        System.out.println(editDistance.minDistance(s1,s2));

//        RegexMatching regexMatching = new RegexMatching();
//        String s = "aab";
//        String p = "a*a*b";
//        System.out.println(regexMatching.isMatch(s,p));

//        IncreasingSubsequence increasingSubsequence = new IncreasingSubsequence();
//        int[] nums = {10,2,5,9};
//
//        System.out.println(increasingSubsequence.lengthOfLIS(nums));
//        for (Integer an : ans) {
//            System.out.println(an);
//        }
//        TargetSum targetSum = new TargetSum();
//        int[] nums = {1,1,1,1,1};
//        System.out.println(targetSum.findTargetSumWays(nums,3));

        int[][] matrix = {
                {9, 9, 4},
                {6, 6, 8},
                {2, 1, 1}
        };

        LongestIncreasingPath longestIncreasingPath = new LongestIncreasingPath();
        System.out.println(longestIncreasingPath.longestIncreasingPath(matrix));


    }
}
