package org.example.neetcode150.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombination {
    HashMap<Character, String> hashMap = new HashMap<>();
    List<String> ans = new ArrayList<>();
    StringBuilder stringBuilder = new StringBuilder();

    public List<String> letterCombinations(String digits) {
        hashMap.put('2', "abc");
        hashMap.put('3', "def");
        hashMap.put('4', "ghi");
        hashMap.put('5', "jkl");
        hashMap.put('6', "mno");
        hashMap.put('7', "pqrs");
        hashMap.put('8', "tuv");
        hashMap.put('9', "wxyz");
        combination(digits, 0, stringBuilder);
        return ans;
    }

    public void combination(String digits, int index, StringBuilder sb) {

        if (index == digits.length()) {
            ans.add(sb.toString());
            return;
        }

        char[] chars = hashMap.get(digits.charAt(index)).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
            combination(digits,index+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
