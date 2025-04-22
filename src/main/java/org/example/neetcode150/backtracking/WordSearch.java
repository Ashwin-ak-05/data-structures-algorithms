package org.example.neetcode150.backtracking;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        return search(board,word,0,0,0);
    }

    public boolean search(char[][] board, String word, int index,int i, int j ) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        boolean left_increment = search(board, word, index + 1, i + 1, j);
        boolean right_increment = search(board, word, index + 1, i, j + 1);
        boolean top_increment = search(board, word, index + 1, i - 1, j);
        boolean bottom_increment = search(board, word, index + 1, i, j - 1);

        board[i][j] = temp;

        return left_increment || right_increment || top_increment || bottom_increment;
    }
}
