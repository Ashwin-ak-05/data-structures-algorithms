package org.example.Scaler.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class FlipkartProfit {
    class Pair{
        int a;
        int b;

        Pair(int a, int b){
            this.a = a;
            this.b = b;
        }
    }

    public int solve(int[] A, int[] B) {
        int n = A.length;;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int day = 0;

        List<Pair> list = new ArrayList<>();

        for(int i = 0; i<n; i++){
            list.add(new Pair(A[i],B[i]));
        }

        Collections.sort(list,(p1, p2)->Integer.compare(p1.a,p2.a));

        for(int i = 0; i<n; i++){
            int a = list.get(i).a;
            int b = list.get(i).b;
            if(pq.isEmpty() || a>day){
                pq.add(b);
                day++;
            }
            else{
                if(b>pq.peek()){
                    pq.poll();
                    pq.add(b);
                }
            }
        }

        int mod = 1000000007;
        long sum = 0;


        while(!pq.isEmpty()){
            sum = (sum + pq.poll())%mod;

        }

        return (int) sum;
    }
}
