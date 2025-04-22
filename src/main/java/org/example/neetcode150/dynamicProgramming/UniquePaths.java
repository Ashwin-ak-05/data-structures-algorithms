package org.example.neetcode150.dynamicProgramming;

public class UniquePaths {
    int[][] arr;
    public int uniquePaths(int m, int n) {
        arr = new int[2][n];
        // for(int[] a : arr){
        //     Arrays.fill(a,-1);
        // }

        arr[0][0] = 1;
        for(int i = 1; i<2;i++){
            arr[i][0] = 1;
        }

        for(int j = 1; j<n; j++){
            arr[0][j] = 1;
        }

        for(int i = 1; i<m; i++){
            for(int j = 1; j<n; j++){
                arr[i%2][j] = arr[(i-1)%2][j] + arr[i%2][j-1];
            }
        }

        return arr[(m-1)%2][n-1];




        //return minWays(m-1,n-1);

    }

    public int minWays(int i, int j){
        if(i<0 || j<0){
            return 0;
        }

        if(i==0 && j ==0){
            return 1;
        }

        if(arr[i][j] != -1){
            return arr[i][j];
        }

        int a =  minWays(i-1,j);
        int b =  minWays(i,j-1);

        return arr[i][j] =  a+b;





    }
}
