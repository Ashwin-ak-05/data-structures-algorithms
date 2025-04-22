package org.example.neetcode150.arrays;

import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char num = board[i][j];

                if (num != '.') {
                    String i_idx = num + "row" + i;
                    String j_idx = num + "col" + j;
                    String inner = num + String.valueOf(i / 3) + "-" + String.valueOf(j / 3);

                    if (hashSet.contains(i_idx) || hashSet.contains(j_idx) || hashSet.contains(inner)) {
                        return false;
                    } else {
                        hashSet.add(i_idx);
                        hashSet.add(j_idx);
                        hashSet.add(inner);

                    }
                }

            }
        }
        return true;
    }
}
