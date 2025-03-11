package org.example.neetcode150.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    char[][] matrix;
    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        matrix = new char[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = '.';
            }
        }

        solve(n, 0, matrix);
        return ans;
    }

    public void solve(int n, int i, char[][] board) {
        if (i >= n) {
           // ans = board;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(i, col, matrix, n)) {
                matrix[i][col] = 'Q';
                solve(n, i + 1, board);
                matrix[i][col] = '.';
            }
        }

    }

    public boolean isValid(int row, int col, char[][] board, int n) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        int i = row - 1;
        int j = col - 1;

        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j--;
        }

        i = row - 1;
        j = col + 1;

        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }


    public void addToAns(char[][] board) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            String string = "";
            for (int j = 0; j < board[0].length; j++) {
               // list.add(Character.toString(board[i][j]));
                string += Character.toString(board[i][j]);
            }
            list.add(string);
        }
        ans.add(list);
    }


}
