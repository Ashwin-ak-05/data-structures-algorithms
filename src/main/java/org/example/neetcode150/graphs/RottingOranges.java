package org.example.neetcode150.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j));
                }

            }
        }

        q.add(new Pair(-1, -1));

        int count = 0;

        while (!q.isEmpty()) {
            Pair pair = q.poll();

            int x = pair.x;
            int y = pair.y;

            if (x == -1 && y == -1) {

                if (!q.isEmpty()) {
                    count++;
                    q.add(new Pair(-1, -1));
                }
                continue;
            }

            int[] drow = { -1, 1, 0, 0 };
            int[] dcol = { 0, 0, -1, 1 };

            for (int i = 0; i < 4; i++) {
                int nrow = x + drow[i];
                int ncol = y + dcol[i];

                if (nrow < n && ncol < m && nrow >= 0 && ncol >= 0 && grid[nrow][ncol] == 1) {
                    grid[nrow][ncol] = 2;
                    q.add(new Pair(nrow, ncol));
                }

            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return count;

    }
}
