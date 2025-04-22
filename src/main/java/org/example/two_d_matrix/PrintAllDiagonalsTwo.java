package org.example.two_d_matrix;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDiagonalsTwo {
    int n;
    int m;
    //int[][] arr;
    List<List<Integer>> arr = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    int[] print(List<List<Integer>> A) {
        n = A.size();
        m = A.get(0).size();
        arr = A;

        //0th row starting point
        int col = 0;
        for (int row = 0; row < n; row++) {
            printDiagonals(row, col);

        }

        int r = n - 1;
        for (int c = 1; c < m; c++) {
            if(c < arr.get(r).size()){
                printDiagonals(r, c);
                
            }
            //while (arr.get(r).get(c))

        }

        int[] ans = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;

    }

    void printDiagonals(int row, int col) {
        //int curr_col = arr[row].length;
        while (row >= 0 ) {
            if(col < arr.get(row).size()){
                //System.out.print(arr.get(row).get(col)+ " ");
                list.add(arr.get(row).get(col));
            }
            row--;
            col++;
        }
        System.out.println();
    }

}
