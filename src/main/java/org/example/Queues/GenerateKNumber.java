package org.example.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateKNumber {
    //Generate Kth number using 1 and 2;



    public String GeneerateKthElement(int k){
        Queue<StringBuilder> queue = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder("1");

        queue.add(stringBuilder);
         stringBuilder = new StringBuilder("2");
         queue.add(stringBuilder);


         for(int i = 1; i<k;i++){

             StringBuilder t1 = queue.poll();
             StringBuilder t2 = new StringBuilder(t1);

             t1.append("1");
             queue.add(t1);
             t2.append("2");

             queue.add(t2);
         }

         return queue.peek().toString();
    }
}
