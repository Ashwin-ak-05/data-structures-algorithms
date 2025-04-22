package org.example.neetcode150.graphs;

public class SurroundedRegions {
    int n;
    int m;

    public void solve(char[][] board) {
        n = board.length;
        m = board[0].length;
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            if (!visited[i][0] || board[i][0] != 'X') {
                dfs(board, visited, i, 0);
            }
        }

        for (int i = 0; i < n; i++) {
            int j = m - 1;
            if (!visited[i][j] || board[i][j] != 'X') {
                dfs(board, visited, i, j);
            }
        }

        for (int j = 0; j < m; j++) {
            int i = 0;
            if (!visited[i][j] || board[i][j] != 'X') {
                dfs(board, visited, i, j);
            }
        }

        for (int j = 0; j < m; j++) {
            int i = n - 1;
            if (!visited[i][j] || board[i][j] != 'X') {
                dfs(board, visited, i, j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O' && !visited[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }

        // return board;

    }

    public void dfs(char[][] board, boolean[][] visited, int i, int j) {

        if (i >= n || j >= m || i < 0 || j < 0 || visited[i][j] || board[i][j] == 'X') {
            return;
        }

        visited[i][j] = true;
        dfs(board, visited, i + 1, j);
        dfs(board, visited, i - 1, j);
        dfs(board, visited, i, j + 1);
        dfs(board, visited, i, j - 1);

    }
}
