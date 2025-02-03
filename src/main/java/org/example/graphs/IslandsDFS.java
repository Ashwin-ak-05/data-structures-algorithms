package org.example.graphs;

import java.util.Arrays;

public class IslandsDFS {
    boolean[][] visited;
    int n;
    int m;

    public int numIslands(char[][] grid) {
        n = grid.length;
        m = grid[0].length;

        int count = 0;
        visited = new boolean[n][m];
        for (boolean[] booleans : visited) {
            Arrays.fill(booleans, false);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    //visited[i][j]=true;
                    dfs(i, j, grid);
                }
            }
        }

        return count;

    }

    void dfs(int i, int j, char[][] grid) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        dfs(i - 1, j, grid);
        dfs(i + 1, j, grid);
        dfs(i, j - 1, grid);
        dfs(i, j + 1, grid);

    }
}
