package org.example.searching;

public class WorkPartition {
    int minDays(int[] arr, int k){
        int low = 0;
        int high = 0;


        for(int i = 0; i<arr.length;i++){
            high += arr[i];
            low = Math.max(low,arr[i]);
        }

        int ans = high;
        while (low <= high){
            int m = (low + high)/2;
            boolean canComplete = canComplete(arr,m,k);
            if(canComplete){
                ans = m;
                high = m -1;
            }
            else {
                low = m + 1;
            }
        }
        return ans;
    }

    boolean canComplete(int[] arr, int m, int k){
        int workers = 1; int sum = 0;

        for (int i = 0; i<arr.length;i++){
            sum = sum + arr[i];
            if(sum > m && arr[i]<=m){
                sum = arr[i];
                workers++;
            }
            if(workers > k){
                return false;
            }
            if(arr[i]>m){
                return false;
            }
        }
        return true;
    }
}
