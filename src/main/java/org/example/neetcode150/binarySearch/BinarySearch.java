package org.example.neetcode150.binarySearch;

public class BinarySearch {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;

        while (l<=r){
            int m = (l+r)/2;
            if(arr[m]==target){
                return m;
            }
            else if(target > arr[m]){
                l = m+1;
            }
            else {
                r = m-1;
            }
        }
        return -1;
    }
}
