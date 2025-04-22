package org.example.neetcode150.graphs;
import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGates {
    private static final int INF = Integer.MAX_VALUE;
    private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public void wallsAndGates(int[][] rooms) {
        if (rooms == null || rooms.length == 0) return;
        int rows = rooms.length, cols = rooms[0].length;
        Queue<int[]> queue = new LinkedList<>();

        // Step 1: Add all gates to the queue
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (rooms[r][c] == 0) {
                    queue.offer(new int[]{r, c});
                }
            }
        }

        // Step 2: BFS from all gates
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int row = point[0], col = point[1];

            for (int[] dir : DIRECTIONS) {
                int newRow = row + dir[0], newCol = col + dir[1];

                // If out of bounds or not an empty room, skip
                if (newRow < 0 || newRow >= rows || newCol < 0 || newCol >= cols || rooms[newRow][newCol] != INF) {
                    continue;
                }

                // Update distance and enqueue the room
                rooms[newRow][newCol] = rooms[row][col] + 1;
                queue.offer(new int[]{newRow, newCol});
            }
        }
    }

}
