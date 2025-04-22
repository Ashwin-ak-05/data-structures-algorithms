package org.example.two_d_matrix;

import java.util.ArrayList;

public class PrintBoundary {
    static void boundaryTraversal(int mat[][]) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        int i = 0;
        int j = 0;

        int n =  mat.length;

        while (n>1) {


            while (j < mat[i].length - 1) {
                arrayList.add(mat[i][j]);
                System.out.println(mat[i][j]);
                j++;
            }

            while (i < mat.length - 1) {
                arrayList.add(mat[i][j]);
                System.out.println(mat[i][j]);
                i++;
            }

            while (j > 0) {
                arrayList.add(mat[i][j]);
                System.out.println(mat[i][j]);
                j--;
            }

            while (i > 0) {
                arrayList.add(mat[i][j]);
                System.out.println(mat[i][j]);
                i--;
            }

            n = n-2;
            i++;
            j++;

        }

        if (n == 1){
            System.out.println(mat[i][j]);
        }
    }
}
