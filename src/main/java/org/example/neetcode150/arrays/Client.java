package org.example.neetcode150.arrays;

public class Client {
    public static void main(String[] args) {
//        EncodingDecoding encodingDecoding = new EncodingDecoding();
//        String[] strings = {"b4aUljwFRv", "mhZhygJ", "nshZ", "Z8!", "VvDoI0rmw"};
//        String encodedString = encodingDecoding.encode(strings);
//        String[] decoded_string = encodingDecoding.decode(encodedString);
//        for (String string : decoded_string) {
//            System.out.println(string);
//        }
//        String string = ".,";
//        System.out.println(ValidPalindrome.isPalindrome(string));
//        TwoSumSortedArray twoSumSortedArray = new TwoSumSortedArray();
//        int[] nums = {4,7,9,13,20,24,28,35};
//        int[] ans = twoSumSortedArray.twoSum(nums,33);
//        System.out.println(ans[0]);
//        System.out.println(ans[1]);

//        ThreeSum threeSum = new ThreeSum();
//        int[] nums = {-1,0,1,2,-1,-4};
//        System.out.println(threeSum.threeSum(nums));

//        MaximumProfit maximumProfit = new MaximumProfit();
//        int[] prices = {3,2,6,5,0,3};
//        System.out.println(maximumProfit.maxProfit(prices));
//        LongestSustringNonRepeating longestSustringNonRepeating = new LongestSustringNonRepeating();
//        System.out.println(longestSustringNonRepeating.lengthOfLongestSubstring("pwwkew"));

        LongestRepeatingSubstring longestRepeatingSubstring = new LongestRepeatingSubstring();
        String s = "AABABBA";
        System.out.println(longestRepeatingSubstring.characterReplacement(s,1));
    }
}
