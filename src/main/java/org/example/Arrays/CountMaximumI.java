package org.example.Arrays;

public class CountMaximumI {

    static int count(int[] arr) {
        int count = 0;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
                count = 1;
                //count++;
            }
            else if(max == arr[i]){
                count++;
            }

        }
        return arr.length - count;
    }
}
