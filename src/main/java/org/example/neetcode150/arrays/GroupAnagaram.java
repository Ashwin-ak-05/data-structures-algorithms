package org.example.neetcode150.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagaram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> anagrams = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);

            anagrams.putIfAbsent(str,new ArrayList<>());
            anagrams.get(str).add(strs[i]);
        }

        return new ArrayList<>(anagrams.values());
    }
}
