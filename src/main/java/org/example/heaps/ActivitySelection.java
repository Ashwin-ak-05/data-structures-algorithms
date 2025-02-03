package org.example.heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ActivitySelection {
    class Intervals implements Comparable<Intervals> {
        int start;
        int end;

        Intervals(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Intervals o) {
            return Double.compare(o.end, this.end);
        }
    }


    List<Intervals> intervals = new ArrayList<>();

    public int activitySelection(List<Integer> start, List<Integer> end) {
        for (int i = 0; i < start.size(); i++) {
            Intervals obj = new Intervals(start.get(i), end.get(i));
            intervals.add(obj);
        }

        Collections.sort(intervals);
        int ans = 0;
        int endingInterval = -1;

        for (int i = 0; i < intervals.size(); i++) {
            if (intervals.get(i).start > endingInterval) {
                ans++;
                endingInterval = intervals.get(i).end;
            }
        }

        return ans;

    }

    List<Intervals> intervalsList = new ArrayList<>();
    public int eraseOverlapIntervals(int[][] intervals) {
        for(int i = 0; i<intervals.length; i++){
            Intervals obj = new Intervals(intervals[i][0],intervals[i][1]);
            intervalsList.add(obj);
        }

        Collections.sort(intervalsList);
        int ans = 0;
        int endingInterval = -1;

        for (int i = 0; i < intervalsList.size(); i++) {
            if (intervalsList.get(i).start > endingInterval) {
                ans++;
                endingInterval = intervalsList.get(i).end;
            }
        }

        return intervalsList.size()-ans;
    }
}
