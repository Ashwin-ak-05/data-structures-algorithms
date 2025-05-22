package org.example.neetcode150.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;

        if (n <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        for (int i = 1; i < n; i++) {

            int size = merged.size();

            int prev_start = merged.get(size - 1)[0];
            int prev_end = merged.get(size - 1)[1];

            int curr_start = intervals[i][0];
            int curr_end = intervals[i][1];

            if (prev_end >= curr_start) {
                int start = Math.min(curr_start, prev_start);
                int end = Math.max(curr_end, prev_end);

                int[] val = new int[] { start, end };
                merged.remove(size - 1);
                merged.add(val);
            } else {
                merged.add(intervals[i]);
            }

        }

        int[][] result = merged.toArray(new int[merged.size()][]);
        return result;
    }
}
