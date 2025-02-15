package org.example.sorting;

public class PivotArray {
    public int[] pivotArray(int[] arr, int pivot) {
        int i = 0;
        int j = 0;

        while (i<arr.length){
            if(arr[i]<pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else {
                i++;
            }
        }

        int temp = arr[arr.length-1];
        arr[arr.length-1] = arr[j+1];
        arr[j+1] = temp;

        return arr;
    }
}
