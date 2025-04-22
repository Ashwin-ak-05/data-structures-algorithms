package org.example.neetcode150.graphs;

public class Client {
    public static void main(String[] args) {
        PacificAtlantic pacificAtlantic = new PacificAtlantic();
        int[][] heights = {
                {1,2,2,3,5},
                {1,2,2,3,5},
                {2,4,5,3,1},
                {6,7,1,4,5},
                {5,1,1,2,4}
        };

        pacificAtlantic.pacificAtlantic(heights);

    }
}
