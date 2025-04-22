package org.example.two_d_matrix;

public class Client {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        PrintBoundary.boundaryTraversal(mat);
    }

}
