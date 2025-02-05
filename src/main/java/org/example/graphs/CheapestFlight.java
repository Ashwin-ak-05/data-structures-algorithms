package org.example.graphs;

import java.util.*;

public class CheapestFlight {
    class Flight{
        int from;
        int to;
        int cost;
        int count;

        Flight(int from, int to, int cost){
            this.from = from;
            this.to = to;
            this.cost = cost;
            this.count = 0;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] cost_list = new int[n];
        Arrays.fill(cost_list,Integer.MAX_VALUE);
        ArrayList<ArrayList<Flight>> flightList = new ArrayList<>();
        PriorityQueue<Flight> pq = new PriorityQueue<>(Comparator.comparing(flight -> flight.cost));

        for(int i = 0; i<n; i++){
            flightList.add(new ArrayList<>());
        }

        for(int i = 0; i<flights.length; i++){
            int from = flights[i][0];
            int to = flights[i][1];
            int cost = flights[i][2];

            Flight flight = new Flight(from,to,cost);
            flightList.get(flight.from).add(flight);
        }

        pq.add(new Flight(src,src,0));

        while (!pq.isEmpty()){
            Flight temp = pq.poll();
            if(cost_list[temp.to] == Integer.MAX_VALUE && temp.count <= k+1 ){
                cost_list[temp.to] = temp.cost;
                ArrayList<Flight> list = flightList.get(temp.to);

                for(int i = 0; i< list.size(); i++){
                    Flight flight = list.get(i);
                    if(cost_list[flight.to] == Integer.MAX_VALUE){
                        flight.cost = flight.cost + temp.cost;
                        flight.count =  temp.count + 1;
                        pq.add(flight);
                    }

                }
            }
        }

        if(cost_list[dst] != Integer.MAX_VALUE){
            return cost_list[dst];
        }
        return -1;
    }
}
