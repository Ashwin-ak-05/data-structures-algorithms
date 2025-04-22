package org.example.carry_forward;

public class FindAGPairs {
    int countPair(char[] arr){
        int n = arr.length;
        int count = 0;
        int ans = 0;

        for (int i = n-1; i>=0; i--){
            if(arr[i] == 'a'){
                ans = ans + count;
            }
            else if(arr[i]=='g'){
                count ++;
            }
        }
        return ans;
    }
}
