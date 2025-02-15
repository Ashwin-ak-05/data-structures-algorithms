package org.example.searching;

public class BinarySearch {
    public int search(int[] arr, int target) {
        int l = 0;
        int r = arr.length-1;

        while (l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){
                r = mid-1;
            }
            else if(arr[mid]<target){
                l = mid+1;
            }
        }
        return -1;
    }
}
