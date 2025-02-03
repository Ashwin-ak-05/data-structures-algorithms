package org.example.heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class JobScheduling {

    class Schedule implements Comparable<Schedule> {
        int profit;
        int deadline;

        Schedule(int profit, int deadline) {
            this.profit = profit;
            this.deadline = deadline;
        }

        @Override
        public int compareTo(Schedule o) {
            return this.deadline - o.deadline;
        }
    }


    public ArrayList<Integer> JobSequencing(int[] id, int[] deadline, int[] profit) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        List<Schedule> scheduleList = new ArrayList<>();

        for (int i = 0; i < id.length; i++) {
            scheduleList.add(new Schedule(profit[i], deadline[i]));
        }

        Collections.sort(scheduleList);

        for (int i = 0; i < scheduleList.size(); i++) {
            if (scheduleList.get(i).deadline > priorityQueue.size()) {
                priorityQueue.add(scheduleList.get(i).profit);
            } else {
                if (priorityQueue.peek() < scheduleList.get(i).profit) {
                    priorityQueue.poll();
                    priorityQueue.add(scheduleList.get(i).profit);
                }
            }
        }

        Integer count = 0;
        Integer totalProfit = 0;

        while (!priorityQueue.isEmpty()) {
            totalProfit += priorityQueue.poll();
            count++;
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(count);
        result.add(totalProfit);

        return result;

    }
}
