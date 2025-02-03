package org.example.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for(int j = 0; j< n; j++ ){
                if(grid[i][j]==2){
                    Pair pair = new Pair(i,j);
                    queue.add(pair);
                }
            }
        }

        queue.add(new Pair(-1,-1));

        int count = 0;

        while (!queue.isEmpty()){
            Pair pair = queue.poll();
            if(pair.x == -1 && pair.y == -1){
                count++;
                //continue;
                if(!queue.isEmpty()){
                    queue.add(new Pair(-1,-1));
                    continue;
                }
                continue;
            }

            int i = pair.x;;
            int j = pair.y;;
            int val = grid[i][j];

            if(i+1 < m && grid[i+1][j] == 1 ){
                grid[i+1][j] = 2;
                queue.add(new Pair(i+1,j));
            }

            if(i-1 >=0 && grid[i-1][j] == 1 ){
                grid[i-1][j] = 2;
                queue.add(new Pair(i-1,j));
            }

            if(j+1<n && grid[i][j+1] == 1){
                grid[i][j+1] = 2;
                queue.add(new Pair(i,j+1));
            }

            if(j-1>=0 && grid[i][j-1] == 1){
                grid[i][j-1] = 2;
                queue.add(new Pair(i,j-1));
            }




        }

        for(int i = 0; i<m; i++){
            for(int j = 0; j< n; j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }

        return count -1;


    }
}
