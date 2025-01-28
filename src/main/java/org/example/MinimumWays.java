package org.example;

import java.util.Arrays;

public class MinimumWays {

//    int[][] arr;
//    public int findMinimumWays(int[][] arr){
//        this.arr = arr;
//        //Arrays.fill(arr,-1);
//        int i = arr.length-1;
//        int j = arr[0].length-1;
//        return minWays(i,j);
//
//    }
//
//    public int minWays(int i, int j){
//        if(i<0 || j<0){
//            return 0;
//        }
//
//        if(i==0 && j==0){
//            return 1;
//        }
//
//        if(arr[i][j]==0){
//            arr[i][j]= minWays(i-1,j)+minWays(i,j-1);
//        }
//
//        return arr[i][j];
//    }
int[][] arr;
    public int uniquePaths(int m, int n) {
        arr = new int[m+1][n+1];
        return minWays(m,n);

    }

    public int minWays(int i, int j){
        if(i<0 || j<0){
            return 0;
        }

        if(i==0 && j==0){
            return 1;
        }

        if(arr[i][j]==0){
            arr[i][j]= minWays(i-1,j)+minWays(i,j-1);
        }

        return arr[i][j];
    }

}
