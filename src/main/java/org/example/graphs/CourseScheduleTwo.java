package org.example.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleTwo {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int[] inDegree = new int[numCourses];
        int count = 0;
        List<Integer> course_list = new ArrayList<>();

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
            course_list.add(temp);
            count++;
            List<Integer> list = graph.get(temp);
            for (int i = 0; i < list.size(); i++) {
                inDegree[list.get(i)] = inDegree[list.get(i)] -1;
                if(inDegree[list.get(i)] == 0){
                    queue.add(list.get(i));
                }
            }

        }

        int[] finished_courses = new int[course_list.size()];
        for(int i = 0; i<course_list.size(); i++){
            finished_courses[i] = course_list.get(i);
        }

        if(count == numCourses){
            return finished_courses;
        }

        return new int[0];
    }
}
