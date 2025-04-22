package org.example.neetcode150.stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class CarFleet {
    class Pair implements Comparable<Pair> {
        int position;
        int speed;

        Pair(int position, int speed) {
            this.position = position;
            this.speed = speed;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(o.position, this.position);

        }
    }

    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Pair> stack = new Stack<>();
        List<Pair> pairs = new ArrayList<>();


        for (int i = 0; i < position.length; i++) {
            Pair pair = new Pair(position[i], speed[i]);
            pairs.add(pair);
        }

        Collections.sort(pairs);

        for (int i = 0; i < pairs.size(); i++) {
            Pair pair = pairs.get(i);

            if (stack.isEmpty()) {
                stack.push(pair);
            } else {
                Pair peek_ele = stack.peek();
                Pair curr_ele = pairs.get(i);

                double peek_time = (double) (target - peek_ele.position) / peek_ele.speed;
                double curr_time = (double) (target - curr_ele.position) / curr_ele.speed;

                if (peek_time < curr_time) {
                    stack.push(curr_ele);
                }
            }

        }

        return stack.size();

    }
}
