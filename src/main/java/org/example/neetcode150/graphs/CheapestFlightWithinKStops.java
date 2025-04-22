package org.example.neetcode150.graphs;

import java.util.*;

public class CheapestFlightWithinKStops {
    class Tuple {
        int stop;
        int price;
        int count;

        Tuple(int stop, int price, int count) {
            this.stop = stop;
            this.price = price;
            this.count = count;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> graph = new ArrayList<>();
        int[] prices = new int[n];
        Arrays.fill(prices, Integer.MAX_VALUE);

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < flights.length; i++) {
            int[] flight = flights[i];
            graph.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }

        Queue<Tuple> q = new LinkedList<>();

        q.add(new Tuple(src, 0, 0));
        prices[src] = 0;

        while (!q.isEmpty()) {
            Tuple tuple = q.poll();
            int stop = tuple.stop;
            int price = tuple.price;
            int count = tuple.count;

            for (int[] flight : graph.get(stop)) {
                int f_stop = flight[0];
                int f_price = flight[1];

                if (price + f_price < prices[f_stop] && count <= k) {
                    prices[f_stop] = price + f_price;
                    q.add(new Tuple(f_stop, price + f_price, count + 1));
                }

            }
        }

        if (prices[dst] == Integer.MAX_VALUE)
            return -1;
        return prices[dst];
    }
}
