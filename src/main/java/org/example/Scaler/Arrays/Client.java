package org.example.Scaler.Arrays;

public class Client {
    public static void main(String[] args) {
        // int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};

        NonOverlappingIntervals nonOverlappingIntervals = new NonOverlappingIntervals();
        int[][] result = nonOverlappingIntervals.insert(intervals,newInterval);
    }
}
