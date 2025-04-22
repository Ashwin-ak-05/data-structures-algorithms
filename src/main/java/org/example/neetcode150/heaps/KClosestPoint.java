package org.example.neetcode150.heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KClosestPoint {
    class Point implements Comparable<Point> {
        int x,y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }


        @Override
        public int compareTo(Point o) {
            int x1 = this.x;
            int y1 = this.y;
            int x2 = o.x;
            int y2 = o.y;
            int a = (x1*x1) + (y1*y1);
            int b = (x2*x2) + (y2*y2);
            return Integer.compare(a,b);
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq = new PriorityQueue<>();


        for (int[] p : points) {
            pq.add(new Point(p[0], p[1]));
        }


        int[][] ansInt = new int[k][2];
        int i = 0;
        while (i < k) {  
            Point point = pq.poll();
            ansInt[i][0] = point.x;
            ansInt[i][1] = point.y;
            i++;
        }

        return ansInt;

    }

    public static int[][] convertToArray(List<List<Integer>> list) {
        int rows = list.size();
        int[][] array = new int[rows][];

        for (int i = 0; i < rows; i++) {
            // Convert each List<Integer> to int[]
            List<Integer> row = list.get(i);
            array[i] = row.stream().mapToInt(Integer::intValue).toArray();
        }
        return array;
    }
}

