package org.example.Queues;

import java.util.Queue;
import java.util.Stack;

public class ReverseKElement {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < k; i++){
            stack.push(q.poll());
        }

        while(!stack.isEmpty()){
            q.add(stack.pop());
        }

        for(int i = 0; i<q.size() - k; i++){
            int ele = q.poll();
            q.add(ele);
        }
        return q;
    }
}
