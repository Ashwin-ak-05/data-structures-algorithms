package org.example.two_d_matrix;

public class PrintAllDiagonals {
    int n;
    int m;
    int[][] arr;

    void print(int[][] A) {
        n = A.length;
        m = A[0].length;
        arr = A;

        //0th row starting point
        int row = 0;
        for (int col = 0; col < m; col++) {
            printDiagonals(row, col);

        }

        int c = m - 1;
        for (int r = 1; r < n; r++) {

            printDiagonals(r, c);
        }

    }

    void printDiagonals(int row, int col) {
        while (row < n && col >= 0){
            System.out.print(arr[row][col] + " ");
            row++;
            col--;
        }
        System.out.println();
    }
}
