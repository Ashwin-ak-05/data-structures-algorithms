package org.example.neetcode150.binarySearch;

public class SearchInTwoDMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int l = 0;
        int r = (n * m) - 1;

        if(r==0 && l == 0){
            if(matrix[l][r] == target){
                return true;
            }
            else{
                return false;
            }
        }

        while (l <= r) {
            int mid = (l + r) / 2;
            int i = mid / m;
            int j = mid % m;

            if (matrix[i][j] == target) {
                return true;
            } else if (target > matrix[i][j]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return false;
    }
}
