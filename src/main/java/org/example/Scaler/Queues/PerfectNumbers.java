package org.example.Scaler.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class PerfectNumbers {
    public String solve(int A) {
        Queue<String> q =new LinkedList<>();
        q.add("1");
        q.add("2");
        for( int i=1 ; i < A ;i++) {
            String ele=q.peek();
            q.offer(ele + "1");
            q.offer(ele + "2");
            q.poll();
        }
        StringBuilder sb = new StringBuilder( q.peek() );
        sb.reverse();
        String ans = q.poll()+sb;
        return ans;
    }
}
