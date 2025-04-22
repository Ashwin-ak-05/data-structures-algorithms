package org.example.Scaler.Queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NIntegerOneTwoThree {
    public ArrayList<Integer> solve(int A) {
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        int count = 3;

        while(ans.size()<A){
            int front = q.peek();
            q.remove();
            ans.add(front);
            if(count>A){
                continue;
            }

            q.add(front*10+1);
            q.add(front*10+2);
            q.add(front*10+3);
            count++;
        }
        return ans;
    }
}
