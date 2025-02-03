package org.example.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {

    PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> min = new PriorityQueue<>();


    public MedianFinder() {

    }

    public void addNum(int num) {
        if (max.isEmpty()) {
            max.add(num);
        } else {
            if (num < max.peek()) {
                max.add(num);
            } else {
                min.add(num);
            }

            if (max.size() - min.size() > 1) {
                min.add(max.poll());
            }

            if (min.size() - max.size() > 1) {
                max.add(min.poll());
            }


        }
    }

    public double findMedian() {
        double median = 0;
        if (max.size() == min.size()) {
            median = (double) (min.peek() + max.peek()) / 2;
        }

        if (max.size() > min.size()) {
            median = (double) max.peek();
        }

        if (min.size() > max.size()) {
            median = (double) min.peek();
        }
        return median;
    }
}
