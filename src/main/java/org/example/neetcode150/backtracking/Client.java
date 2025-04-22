package org.example.neetcode150.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
//        LetterCombination letterCombination = new LetterCombination();
//        String string = "23";
//        List<String> list = letterCombination.letterCombinations(string);
//        for (String s : list) {
//            System.out.println(s+" ");
//        }
//        PalindromicPartitioning palindromicPartitioning = new PalindromicPartitioning();
//        String string = "aab";
//        palindromicPartitioning.partition(string);
//
//        NQueens nQueens = new NQueens();
//        char[][] ans = nQueens.solveNQueens(4);
//
//        for (int i = 0; i < ans.length; i++) {
//            for(int j = 0; j<ans[0].length; j++){
//                System.out.print(ans[i][j]+" ");
//            }
//            System.out.println();
//        }

        PrintAllSubstring printAllSubstring = new PrintAllSubstring();
        String string = "abacdef";
        printAllSubstring.print(string,0);
    }
}
