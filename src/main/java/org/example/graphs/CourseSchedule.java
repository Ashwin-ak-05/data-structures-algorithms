package org.example.graphs;

import java.util.*;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int[] inDegree = new int[numCourses];
        int count = 0;

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int course = prerequisites[i][0];
            int preReq = prerequisites[i][1];

            graph.get(preReq).add(course);
            inDegree[course] = inDegree[course] + 1;
        }


        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            count++;
            List<Integer> list = graph.get(temp);
            for (int i = 0; i < list.size(); i++) {
                inDegree[list.get(i)] = inDegree[list.get(i)] -1;
                if(inDegree[list.get(i)] == 0){
                    queue.add(list.get(i));
                }
            }

        }

        return count == numCourses;
    }
}
