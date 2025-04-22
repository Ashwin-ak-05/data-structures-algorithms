package org.example.neetcode150.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlantic {
    boolean[][] pacific;
    boolean[][] atlantic;
    int n;
    int m;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        n = heights.length;
        m = heights[0].length;

        pacific = new boolean[n][m];
        atlantic = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            dfs(heights, pacific, i, 0, Integer.MIN_VALUE);
            dfs(heights, atlantic, i, m - 1, Integer.MIN_VALUE);
        }

        for (int j = 0; j < m; j++) {
            dfs(heights, pacific, 0, j, Integer.MIN_VALUE);
            dfs(heights, atlantic, n - 1, j, Integer.MIN_VALUE);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }
        print(pacific,atlantic);
        return ans;

    }

    public void dfs(int[][] heights, boolean[][] ocean, int i, int j, int prev) {
        if (i < 0 || j < 0 || i >= n || j >= m || heights[i][j] < prev || ocean[i][j]) {
            return;
        }

        ocean[i][j] = true;
        dfs(heights, ocean, i + 1, j, heights[i][j]);
        dfs(heights, ocean, i - 1, j, heights[i][j]);
        dfs(heights, ocean, i, j + 1, heights[i][j]);
        dfs(heights, ocean, i, j - 1, heights[i][j]);
    }

    public void print(boolean[][] pacific, boolean[][] atlantic) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((pacific[i][j] ? 'T' : 'F') + "-" + (atlantic[i][j] ? 'T' : 'F') + "  ");
            }
            System.out.println();
        }
    }
}
